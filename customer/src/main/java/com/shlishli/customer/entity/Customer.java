package com.shlishli.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shlishli.customer.utilities.IConstants;


@Entity
@Table(name = IConstants.CUSTOMERS_TABLE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String firebaseCustomerId;
    // customer Id would be the ID obtained after a succesful Signup /Sign in with firebase

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String mobileNumber;
    private String imageUrl;
    private String footSize;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setFirebaseCustomerId(String firebaseCustomerId) {
        this.firebaseCustomerId = firebaseCustomerId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setFootSize(String footSize) {
        this.footSize = footSize;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    

    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getFirebaseCustomerId() {
        return firebaseCustomerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getFootSize() {
        return footSize;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }
    


    
}
