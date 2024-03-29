package com.bruce.raeasy.models;

public class User {

    private String id, phone, email, fullName, institute, regNo, regDate, imageUrl;

    public User() {
    }

    public User(
            String id, String phone, String email, String fullName, String institute, String regNo,
            String regDate, String imageUrl
    ) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.fullName = fullName;
        this.institute = institute;
        this.regNo = regNo;
        this.regDate = regDate;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", institute='" + institute + '\'' +
                ", regNo='" + regNo + '\'' +
                ", regDate='" + regDate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
