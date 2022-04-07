package com.dodoke.app2;

public class Customer {
    private String name;// 姓名
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

    public void OutMoney(){
        System.out.println("买车花了钱");
    }
    public void GetCar(){
        System.out.println("买车了");
    }
}

