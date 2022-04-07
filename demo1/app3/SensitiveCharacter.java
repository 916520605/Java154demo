package com.dodoke.app3;

import java.util.Scanner;

public class SensitiveCharacter {
    // 键盘录入一个手机号，将中间四位号码屏蔽，最终效果为：
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("请输入手机号：");
            String phoneNumber = sc.next();                 //包前不包后
            System.out.println("您输入的手机号是：" + phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7, 11));

    }


}
