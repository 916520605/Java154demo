package com.dodoke.app1;

public class CompareArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        int[] b={4,5,3,4,2};
        System.out.println(CompareArr(a, b));
    }



   // 比较2个数组是否一样
    public static boolean CompareArr(int[] arr1,int[] arr2){
        if (arr1.length== arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;    //整个循环走下来没有发现不一样的，那就是一样的
        }else
            return false;  //长度不相等，也是不一样
    }

}
