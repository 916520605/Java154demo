package com.dodoke.app1;

import java.util.Random;

public class MethodTest6 {
    public static void main(String[] args) {
        /*需求：一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）*/

        //定义一个数组放默认抽奖的奖池
        int[] arr1={2,588,888,1000,10000};
        //定义一个空数组，用来存放被抽中的奖金
        int[] arr2=new int[arr1.length];
        Random r=new Random();
        for (int i = 0; i < arr1.length; i++) {
            while (true){
                //随机抽取一个索引提取金额,索引范围在arr1的索引中取。
                int index= r.nextInt(arr1.length);
                int money=arr1[index];
                boolean flag=true;     //默认是true，表示没有被抽中过
                //遍历存放奖金的奖池，判断是否被抽中过
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] == money) {           //如果在奖池里发现，抽出来的奖金在奖池里
                        flag=false;
                        break;    //跳出循环，继续抽
                    }
                }
                if (flag) {//如果是true，表示还没有抽中过，
                    System.out.println("恭喜您抽中"+money);
                    arr2[i]=money;
                    break;

                }
            }
        }



    }
}