package com.dodoke.app2;

public class Seller {
    private String name;//姓名
    private String sex;//性别
    private String phone;//电话号码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void SellCar(){
        System.out.println("卖车");
    }
    public void getMoney(){
        System.out.println("卖车收钱");
    }
}
