package com.dhy.lab.designmode.adapter;

public class VoltageAdapterByCombination implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapterByCombination(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {

        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;

    }
}
