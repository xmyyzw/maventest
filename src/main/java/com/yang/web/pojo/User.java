package com.yang.web.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String gender;

    private String wxName;

    private String wxImg;

    private Date time;

    private Integer type;

    private Integer identified;

    private String number;

    private String introduction;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName == null ? null : wxName.trim();
    }

    public String getWxImg() {
        return wxImg;
    }

    public void setWxImg(String wxImg) {
        this.wxImg = wxImg == null ? null : wxImg.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIdentified() {
        return identified;
    }

    public void setIdentified(Integer identified) {
        this.identified = identified;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", wxName='" + wxName + '\'' +
                ", wxImg='" + wxImg + '\'' +
                ", time=" + time +
                ", type=" + type +
                ", identified=" + identified +
                ", number='" + number + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}