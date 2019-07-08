package ArrayRelated;

import java.util.Arrays;

/**
测试Array 工具类
@author huzhicong
 */
public class lrnArrays {
    public static void main(String[] args){
        int a[]={10,1000,20,11};

        /*
         1. Arrays.toString(a) 打印数组
         与object的toString不同，继承object的类使用toString会打印出类似：
         oop_package.picture@63947c6b（包名，类名，hashcode）
         */
        System.out.println(Arrays.toString(a));



        //排序
        int[] aClone=a.clone();
        Arrays.sort(aClone);
        System.out.println(Arrays.toString(aClone));









    }



}
