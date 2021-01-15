package com.shlishli.merchant.entity;

import javax.annotation.Generated;
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

    private String firebaseCustomerId;
    // customer Id would be the ID obtained after a succesful Signup /Sign in with firebase

    private String businessName;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private int rating;
    private String gstNumber;


    public String getAddress() {
        return address;
    }

    public String getBusinessName() {
        return businessName;
    }
    public String getFirebaseCustomerId() {
        return firebaseCustomerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGstNumber() {
        return gstNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public int getRating() {
        return rating;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    public void setFirebaseCustomerId(String firebaseCustomerId) {
        this.firebaseCustomerId = firebaseCustomerId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


}
