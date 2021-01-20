package com.example.api.data.junction.entity;

public class Merchant   {


    private Long merchantId;

    private String firebaseMerchantId;

    private String businessName;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private int rating;
    private String gstNumber;

    public Merchant(Long merchantId, String firebaseMerchantId, String businessName, String firstName, String lastName, String address, String mobileNumber, int rating, String gstNumber) {
        this.merchantId = merchantId;
        this.firebaseMerchantId = firebaseMerchantId;
        this.businessName = businessName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.rating = rating;
        this.gstNumber = gstNumber;
    }

    public Merchant() {
    }

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
