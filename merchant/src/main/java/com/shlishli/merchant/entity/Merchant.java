package com.shlishli.merchant.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shlishli.merchant.utilities.IConstants;



@Entity
@Table(name = IConstants.MERCHANTS_TABLE)
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchantId;

    private String firebaseMerchantId;
    
    private String businessName;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private int rating;
    private String gstNumber;


    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getFirebaseMerchantId() {
        return firebaseMerchantId;
    }

    public void setFirebaseMerchantId(String firebaseMerchantId) {
        this.firebaseMerchantId = firebaseMerchantId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }
}
