package com.dodoke.app1;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44};
        int[] arr2=new int[arr1.length];
        copy(arr1,arr2);
        print(arr1);
        System.out.println(" ");
        print(arr2);
    }

    //复制数组
    public static void copy(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
    }
    //打印数组
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length - 1? arr[i] : arr[i]+",");
        }
        System.out.print("]");
    }
}
