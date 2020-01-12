package com.dhy.lab.algorithm.dichotomy;

import java.util.ArrayList;
import java.util.List;

public class FindLackNumber {

    // 总共的位数，int 32位,这里为了方便举例，数字最大为15只占四位
    private static int bit = 4;

    private static Integer[] temp;
    //存放0
    private static List<Integer> zero;
    //存放1
    private static List<Integer> one;

    private static int number;



    /**
     * 找到数组a中缺少的整数
     * @param a 数组A
     * @return 搜索结果
     */
    public static int find(Integer[] a) {
        temp = a;
        zero = new ArrayList<>();
        one = new ArrayList<>();

        while (bit-- > 0) {
            zero.clear();
            one.clear();
            for (int i = 0; i < temp.length; i++) {
                // 高位为1
                if ((temp[i] & (1 << bit)) != 0) {
                    one.add(temp[i]);
                } else {
                    zero.add(temp[i]);
                }
            }

            if (zero.size() < one.size()) {
                temp = (Integer[]) zero.toArray(new Integer[zero.size()]);
//				number |= 0 << bit;
            } else {
                temp = (Integer[]) one.toArray(new Integer[one.size()]);
                number |= 1 << bit;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        Integer[] a = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(find(a));

    }
}

