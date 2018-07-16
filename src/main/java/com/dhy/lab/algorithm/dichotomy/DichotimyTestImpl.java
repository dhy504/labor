package com.dhy.lab.algorithm.dichotomy;

import java.util.ArrayList;
import java.util.List;

public class DichotimyTestImpl {

    public String binarySearch(List<Integer> paramList, Integer item) {
        int low = 0;
        int high = paramList.size() -1 ;
        int mid;
        int times = 0;
        int guess;


        while (low <= high) {
            //取中位数
            mid = (low + high) / 2;
            //获取猜想值
            guess = paramList.get(mid);
            if (item.equals(guess)) {

                times++;
                System.out.println("寻找到所需要的数,位于数组的第几位：" + mid);
                System.out.println("查询的次数:" + times);
                System.out.println("查询到猜想值为:"+ guess);
                return "success";
            }

            //猜想值大于预期值,则置高位high为mid值
            if (guess > item) {
                high = mid;
                System.out.println("置high位置为mid:" + high);
                times ++;
                continue;
            }

            //否则置低位low为mid值
            System.out.println("置low位置为mid:" + low);
            low = mid;
            times ++;

        }


        System.out.println("未查询到猜想值");
        return null;
    }




    public static void main(String[] args) {
        //参数准备
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        testList.add(10);
        testList.add(11);
        testList.add(12);
        testList.add(13);

        DichotimyTestImpl dichotimyTest = new DichotimyTestImpl();
        dichotimyTest.binarySearch(testList, 14);
    }
}
