package com.dodoke.app1;

import java.util.Random;
import java.util.Scanner;

public class MethodTest7 {
    public static void main(String[] args) {
        //双色球系统-业务分析、随机生成一组中奖号码
        int[] LuckNum = create();
        int[] UserNum = UserNumbers();
        print(LuckNum);
        print(UserNum);
        Compare(LuckNum,UserNum);

    }

    //系统生成数字的方法
    public static int[] create() {
        //定义一个数组，放系统随机生成的7个幸运数字
        int[] numbers = new int[7];
        Random r = new Random();
        //遍历前6个红色号码，不能重复，范围1-33
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;//1-33,(0-32)+1
                //判断这个数字之前是否重复过，不重复就存进去
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = data;
                    //  System.out.println(numbers[i]);
                    break;
                }
            }

        }
//        return numbers;
        //生成第7个蓝球数字，范围在1-16。
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    //用户输入的7个号码
    public static int[] UserNumbers() {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //先让用户输入前6个红球号码
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请先输入第" + (i + 1) + "号码(1-33不重复)");
            int data = sc.nextInt();
            //把数据存入数组中
            numbers[i] = data;
        }
        //再录入蓝球号码
        System.out.println("请您输入蓝球号码：");
        numbers[numbers.length - 1] = sc.nextInt();
        return numbers;
    }

    //打印数组的方法
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    //判断中奖情况
    public static void Compare(int[] LuckNum, int[] UsersNum) {
        //红球中了几个，蓝球中了几个
        //定义两个变量，分别存储蓝球和红球的个数
        //LuckNum= 12,32,23,12,30,34,   10
        //UserNum= 34,10,2,31,9,15     6
        int red = 0;
        int blue = 0;
        //先遍历用户的红球，再遍历系统生成的红球，嵌套循环，蓝球先放一边
        for (int i = 0; i < UsersNum.length - 1; i++) {
            for (int j = 0; j < LuckNum.length - 1; j++) {
                if (UsersNum[i] == LuckNum[j]) {  //如果在系统数字中找到，说明中了。
                    red++;
                    break;//退出内部循环，再开始外部，再开始找
                }
            }
        }
        //判断蓝球是否命中
        //判断两个数组的最后一位，是否相同，是1，不是0
        blue = LuckNum[LuckNum.length - 1] == UsersNum[UsersNum.length - 1] ? 1 : 0;

        if (blue == 1 && red <= 2) {
            System.out.println("5块");
        } else if (blue == 1 && red == 3 || blue == 0 && red == 4) {
            System.out.println("10块");
        } else if (blue == 0 && red == 5 || blue == 1 && red == 4) {
            System.out.println("200块");
        } else if (blue==1&&red==5) {
            System.out.println("3000块");
        }else if (blue == 0 && red ==6 ) {
            System.out.println("500万");
        }else if (blue == 1 && red == 6) {
            System.out.println("1000万");
        }
    }
}
