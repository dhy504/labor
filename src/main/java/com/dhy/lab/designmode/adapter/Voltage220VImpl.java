package com.dhy.lab.designmode.adapter;

public class Voltage220VImpl implements Voltage220V {
    public int output220V() {
        System.out.println("我的输出电压是220V");

        return 220;
    }
}
