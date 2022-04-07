package com.dodoke.app2;

//用javabean实现购车案例
public class Test {
    public static void main(String[] args) {
        //调用Car类的构造方法
        Car car = new Car();
        car.setName("奔驰");
        car.setPrice(5000000.00);
        //调用Customer类的构造方法
        Customer cus = new Customer();
        cus.setName("隔壁老王");
        //调用Money类的构造方法
        Money money = new Money();
        money.setAmount(300);
        //调用Seller类的构造方法
        Seller seller = new Seller();
        seller.setName("新垣结衣");
        seller.setPhone("18888888888");
        System.out.println(cus.getName()+"花了"+money.getAmount()+"元买了价值为"+car.getPrice()+car.getName()+"，顺利的把穿黑丝的"+seller.getName()+"，电话是"+seller.getPhone()+"带回了家");

    }
}
