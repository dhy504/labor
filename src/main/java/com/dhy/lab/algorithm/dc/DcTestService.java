package com.dhy.lab.algorithm.dc;

import java.util.Arrays;

/**
 * D&C测试服务, 分而治之实践 -- 递归思想
 *
 * @author Dong_hy
 * @date 2020/8/3 21:02.
 */
public class DcTestService {

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 3, 2, 1};
        DcTestService testService = new DcTestService();
        System.out.println(testService.sumArray(input));

    }

    public int sumArray(int[] param){

        int length = param.length;
        if (length == 0) {
            return 0;
        }

        int[] nextParam = Arrays.copyOf(param, length - 1);
        int result = param[length-1] + sumArray(nextParam);

        return result;

    }
}
