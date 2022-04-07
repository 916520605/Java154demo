package com.dodoke.app1;

public class MethodSelf {
    public static void main(String[] args) {
        int[] b = {11, 22, 33, 44, 55};
        PrintArray(b);


    }
    //打印数组的内容
    public static void PrintArray(int[] array) {
        System.out.print("该数组的内容为：[");
        for (int i = 0; i < array.length ; i++) {
//            if (i== array.length-1){
//                System.out.print(array[i]);
//            }else
//            System.out.print(array[i]+",");

            //14-17行，也可以用三元表达式:
            System.out.print(i == array.length - 1 ? array[i] : array[i] + ",");
        }
        System.out.print("]");
    }
}