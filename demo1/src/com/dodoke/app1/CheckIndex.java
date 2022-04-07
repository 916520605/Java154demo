package com.dodoke.app1;

public class CheckIndex {
    public static void main(String[] args) {
       int[] a={11,22,33,44};
       int index=CheckIndex1(a,55);
        System.out.println("您要查询的数据的索引是: " + index);
    }



//从数组中查询指定元素的索引，如果不存在，返回-1
    public static int CheckIndex1(int[] array ,int data){
        for (int i = 0; i < array.length; i++) {
            if (data==array[i]){
                return i;
               
            }
        }
        return -1;
    }

    
}
