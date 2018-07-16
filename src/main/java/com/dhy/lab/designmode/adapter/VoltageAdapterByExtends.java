package com.dhy.lab.designmode.adapter;

public class VoltageAdapterByExtends extends Voltage220VImpl implements Voltage5V {



    public int output5V() {
        int voltage = output220V();

        int output = voltage / 44;

        System.out.println("我是适配器我转换后的电压为:" + output);

        return output;
    }
}
