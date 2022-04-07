package com.dodoke.app1;

public class OperatorText {
    public static void main(String[] args) {
        int[] num ={34,56,21,6,76,100};
        //求数组的和
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
        //求数组中的最大值
        int max=num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
        //冒泡排序
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j]>num[j+1]) {
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]= temp;
                }
            }
        }
        for ( int item :num )
         System.out.print(item+" ");



       


    }



}
