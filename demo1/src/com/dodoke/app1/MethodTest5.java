package com.dodoke.app1;

import java.util.Random;

public class MethodTest5 {
    public static void main(String[] args) {
        System.out.println(createString(5));
    }



    public static String createString(int n){
        String code = "";
        Random rand = new Random();
        //定义循环，遍历n
        for (int i = 0; i < n; i++) {
            //生成随机字符，大写，小写，数字 ，用0,1,2表示
            int type= rand.nextInt(3);//0,1,2
            switch (type){
                case 0:
                    //大写，范围是A-Z，65-90
                    char ch=(char)(rand.nextInt(26)+65);
                    code+=ch;
                    break;
                case 1:
                    //小写，范围是a-z，97-97+25
                    char ch1=(char)(rand.nextInt(26)+97);
                    code+=ch1;
                    break;
                case 2:
                    //数字，0-9
                    int ch2 = rand.nextInt(9);
                    code+=ch2;
                    break;

            }
        }
        return code;
    }

}
