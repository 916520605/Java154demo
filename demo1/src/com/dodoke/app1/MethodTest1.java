package com.dodoke.app1;

import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args) {
        //买机票
        //用户输入机票原价，舱位信息，月份信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        double price = sc.nextDouble();

        System.out.println("请您输入机票的月份（1-12月）：");
        int month = sc.nextInt();

        System.out.println("请您选择舱位类型:头等舱或经济舱");
        String type = sc.next();

        //调用一下
        System.out.println("优惠后的机票的价格是：" + LastPrice(price, month, type));
    }

    //方法
    public static double LastPrice(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    price = price * 0.9;
                    break;
                case "经济舱":
                    price = price * 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位有问题，别瞎写");
                    return -1;
            }
        } else if (month > 10 && month <= 12 || month >= 1 && month < 5) {
            //淡季
            switch (type) {
                case "头等舱":
                    price = price * 0.7;
                    break;
                case "经济舱":
                    price = price * 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位有问题，别瞎写");
                    return -1;
            }
        } else {
            System.out.println("请输入正确的1-12的整数月份，别瞎写");
            return -1;
        }
        return price;
    }

}
