package com.example.api.data.junction.entity;

public class Customer {

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

    public Customer(Long customerId, String firebaseCustomerId, String firstName, String lastName, int age, String address, String mobileNumber, String imageUrl, String footSize) {
        this.customerId = customerId;
        this.firebaseCustomerId = firebaseCustomerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.imageUrl = imageUrl;
        this.footSize = footSize;
    }

    public Customer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirebaseCustomerId() {
        return firebaseCustomerId;
    }

    public void setFirebaseCustomerId(String firebaseCustomerId) {
        this.firebaseCustomerId = firebaseCustomerId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFootSize() {
        return footSize;
    }

    public void setFootSize(String footSize) {
        this.footSize = footSize;
    }
}
