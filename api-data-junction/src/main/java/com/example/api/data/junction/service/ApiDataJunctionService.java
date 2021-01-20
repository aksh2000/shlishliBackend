package com.example.api.data.junction.service;

import com.example.api.data.junction.VO.*;
import com.example.api.data.junction.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiDataJunctionService {

    @Autowired
    RestTemplate restTemplate;



    public Product test(){
        Product product = restTemplate.getForObject("http://API-GATEWAY/products/getProductDetails/6", Product.class);
        return product;
    }

    public ResponseTemplate getProductDetails(int productId){

        ResponseTemplate responseTemplate = new ResponseTemplate(true);
        // responseTemplate.success = true;

        ProductPageDetails productPageDetails = new ProductPageDetails();
        List<Inventory> inventories;

        Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/getProductDetails/"+productId, Product.class);
        ResponseEntity<Inventory[]> responseEntity= restTemplate.getForEntity("http://INVENTORY-SERVICE/inventories/getInventoryItemsByProductId/"+productId, Inventory[].class);
        inventories = Arrays.asList(responseEntity.getBody());

        int inventoriesSize = inventories.size();

        List<Merchant> merchants = new ArrayList<>();

        for (Inventory inventory : inventories) {
            System.out.println(inventory.getMerchantId());
            Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/" + inventory.getMerchantId(), Merchant.class);
            merchants.add(merchant);
        }
        List<ProductPageMerchantDetails> productPageMerchantDetails = new ArrayList<>();


        for(int i = 0;i<inventoriesSize;i++){
            ProductPageMerchantDetails productPageMerchantDetails1 = new ProductPageMerchantDetails();
            Inventory inventory = inventories.get(i);
            Merchant merchant = merchants.get(i);

            productPageMerchantDetails1.merchantId = merchant.getMerchantId();
            productPageMerchantDetails1.merchantName = merchant.getFirstName()+" "+merchant.getLastName();
            productPageMerchantDetails1.price = inventory.getPrice();
            productPageMerchantDetails1.quantity = inventory.getQuantity();
            productPageMerchantDetails1.inventoryItemId = inventory.getInventoryItemId();
            productPageMerchantDetails.add(productPageMerchantDetails1);
        }
        productPageDetails.product = product;


        productPageDetails.merchantDetails = productPageMerchantDetails;
        responseTemplate.data = productPageDetails;
        return responseTemplate;

    }

    public ResponseTemplate getTopProducts() {
        ResponseTemplate responseTemplate = new ResponseTemplate(true);
        List<TopProducts> topProducts = new ArrayList<>();

        List<Product> products;
        ResponseEntity<Product[]> responseEntity= restTemplate.getForEntity("http://PRODUCT-SERVICE/products/getTopProducts", Product[].class);
        products = Arrays.asList(responseEntity.getBody());

        for (Product product: products) {
            TopProducts topProducts1 = new TopProducts();
            Inventory inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/getMinPrice/"+product.getProductId(), Inventory.class);
            topProducts1.product = product;
            if(inventory == null){
                topProducts1.price = 0;
            } else {
                topProducts1.price = inventory.getPrice();
            }

            topProducts.add(topProducts1);
        }
        responseTemplate.data = topProducts;
        return responseTemplate;
    }

    public ResponseTemplate getProductsByCategoryId(Long categoryId) {
        ResponseTemplate responseTemplate = new ResponseTemplate(true);
        List<ProductWithPrice> productWithPrices = new ArrayList<>();

        List<Product> products;
        ResponseEntity<Product[]> responseEntity= restTemplate.getForEntity("http://PRODUCT-SERVICE/products/getProducts/"+categoryId, Product[].class);
        products = Arrays.asList(responseEntity.getBody());

        for (Product product:products) {
            ProductWithPrice productWithPrice = new ProductWithPrice();
            Inventory inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/getMinPrice/"+product.getProductId(), Inventory.class);
//            System.out.println(product.getProductId()+"*********");
            if(inventory == null){

                productWithPrice.price = 0;
            }else {
                productWithPrice.price = inventory.getPrice();
            }
            productWithPrice.product = product;
            productWithPrices.add(productWithPrice);
        }

        responseTemplate.data = productWithPrices;
        return  responseTemplate;

    }

    public ResponseTemplate getCartDetails(Long customerId) {
        ResponseTemplate responseTemplate = new ResponseTemplate(true);

        List<CustomerCartDetails> customerCartDetails = new ArrayList<>();

        List<CartItem> cartItems;
        ResponseEntity<CartItem[]> responseEntity= restTemplate.getForEntity("http://CART-SERVICE/carts/getCartDetails/"+customerId, CartItem[].class);
        cartItems = Arrays.asList(responseEntity.getBody());

        for (CartItem cartItem: cartItems) {
            CustomerCartDetails customerCartDetails1 = new CustomerCartDetails();
            Inventory inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/getInventoryDetails/"+cartItem.getInventoryId(), Inventory.class);
            Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/" + inventory.getMerchantId(), Merchant.class);
            Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/getProductDetails/"+inventory.getProductId(), Product.class);
            customerCartDetails1.merchant = merchant;
            customerCartDetails1.product = product;
            customerCartDetails1.quantity = cartItem.getQuantity();
            customerCartDetails1.price = inventory.getPrice();

            customerCartDetails.add(customerCartDetails1);
            customerCartDetails1.inventory = inventory;
            customerCartDetails1.cartId = cartItem.getCartId();
            }
            responseTemplate.data = customerCartDetails;
        return responseTemplate;


    }
    public ResponseTemplate getOrderDetailsByCustomerId(Long customerId)
    {
        ResponseTemplate responseTemplate = new ResponseTemplate(true);

        List<OrderDetailsByCustomerId> orderDetailsByCustomerId=new ArrayList<>();
        List<Order> orders;

        ResponseEntity<Order[]> responseEntity= restTemplate.getForEntity("http://ORDERS-SERVICE/orders/getOrderDetailsByCustomerId/"+ customerId, Order[].class);
        orders = Arrays.asList(responseEntity.getBody());

        for(Order order:orders)
        {
            OrderDetailsByCustomerId orderDetailsByCustomerId1=new OrderDetailsByCustomerId();
            Inventory inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/getInventoryDetails/"+order.getInventoryId(), Inventory.class);
            Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/" + inventory.getMerchantId(), Merchant.class);
            Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/getProductDetails/"+inventory.getProductId(), Product.class);
            Customer customer=restTemplate.getForObject("http://CUSTOMER-SERVICE/customers/getCustomerDetails/"+ order.getCustomerId(), Customer.class);
            orderDetailsByCustomerId1.order=order;
            orderDetailsByCustomerId1.product=product;
            orderDetailsByCustomerId1.inventory=inventory;
            orderDetailsByCustomerId1.merchant=merchant;
            orderDetailsByCustomerId1.customer=customer;

            orderDetailsByCustomerId.add(orderDetailsByCustomerId1);
        }

        responseTemplate.data =orderDetailsByCustomerId;
        return  responseTemplate;
    }

    public ResponseTemplate getOrderDetailsByMerchantId(Long merchantId) {
        ResponseTemplate responseTemplate = new ResponseTemplate(true);

        List<Inventory> inventories;

        ResponseEntity<Inventory[]> responseEntityInventories= restTemplate.getForEntity("http://INVENTORY-SERVICE/inventories/findByMerchantId/"+merchantId, Inventory[].class);
        inventories = Arrays.asList(responseEntityInventories.getBody());

        List<OrderDetailsByMerchantId> orderDetailsByMerchantIds = new ArrayList<>();


        for (Inventory inventory: inventories) {
            List<Order> orders;
            ResponseEntity<Order[]> responseEntityOrders= restTemplate.getForEntity("http://ORDERS-SERVICE/orders/findByInventoryId/"+inventory.getInventoryItemId(), Order[].class);
            orders = Arrays.asList(responseEntityOrders.getBody());

            for (Order order: orders) {

                OrderDetailsByMerchantId orderDetailsByMerchantId = new OrderDetailsByMerchantId();

                Customer customer = restTemplate.getForObject("http://CUSTOMER-SERVICE/customers/getCustomerDetails/"+ order.getCustomerId(), Customer.class);
                Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/getProductDetails/"+inventory.getProductId(), Product.class);
                Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/" + inventory.getMerchantId(), Merchant.class);

                orderDetailsByMerchantId.customer = customer;
                orderDetailsByMerchantId.product = product;
                orderDetailsByMerchantId.inventory = inventory;
                orderDetailsByMerchantId.order = order;
                orderDetailsByMerchantId.merchant = merchant;

                orderDetailsByMerchantIds.add(orderDetailsByMerchantId);
            }
        }

        responseTemplate.data = orderDetailsByMerchantIds;



        return  responseTemplate;
    }
}
