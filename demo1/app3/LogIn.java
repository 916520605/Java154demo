package com.dodoke.app3;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        /*需求：
            ⚫ 模拟用户登录功能，最多只给三次机会。
        分析：
            ① 系统后台定义好正确的登录名称，密码。
            ② 使用循环控制三次，让用户输入正确的登录名和密码，判断是否登录成功，登
            录成功则不再进行登录；登录失败给出提示，并让用户继续登录
         *
         *
         *
         * */
        String name = "dodoke";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("请输入登录名称：");
            String inputName = sc.next();
            System.out.println("请输入登录密码：");
            String inputPassword = sc.next();
            if (inputName.equals(name) && inputPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！");
                count++;
            }
        }
    }
}
