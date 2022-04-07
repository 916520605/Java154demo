package com.dodoke.app1;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        //评委打分
        int[] scores=new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入"+(i+1)+"号评委的分数");
            int score=sc.nextInt();
            scores[i] = score;
        }
        int max=scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >max) {
                //最大值
                max = scores[i];
            }
            if (scores[i]<min){
                //最小值
                min = scores[i];
            }
            sum+=scores[i];
        }
        double res=(sum-max-min)*1.0/(scores.length-2);
        System.out.println("该选手的最后得分是"+res);
    }
}
