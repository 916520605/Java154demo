package com.dodoke.app1;

public class MethodTest2 {
    public static void main(String[] args) {
        Prime(101,200);
    }
    //找素数
    public static void Prime(int a ,int b){
        int count1=0;
        System.out.print("[");
        for (int i = a; i <= b-1; i++) {
            int count=0;
          for (int j = 2; j <= i-1; j++) {
              if(i%j == 0){
                  count=count+1;
                  break;
              }
          }
          if (count ==0) {
                System.out.print(i+" ");
                count1++;
          }
        }
        System.out.print("]"+"\n");
        System.out.println("共有"+count1+"个数字");
    }
}
