package com.dodoke.app1;

public class NewDemo {
    public static void main(String[] args) {
        //Syste--m.out.println("hello word");
        System.out.println("hello world");
        char a='3';
        int b=a;  //自动类型转换
        // byte<short、char<int<long<float<double
        //  前三个在表达式运算中，默认是当int运算的
        //表达式中的最终类型是由最高类型决定的
        System.out.println(a);
        System.out.println(b);
        byte i=10;
        byte j=20;
        double res=i+j;
        System.out.println(res);


    }
}
