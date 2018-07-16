package com.dhy.lab.designmode.adapter;

public class Mobile {


    public void charge(Voltage5V voltage5V) {

        int output =  voltage5V.output5V();

        if (5 == output) {
            System.out.println("正常充电");
        } else {
            System.out.println("炸了");
        }

    }

    public static void main(String[] args) {
        //通过继承适配
//        Mobile mobile = new Mobile();
//        mobile.charge(new VoltageAdapterByExtends());


        //通过组合适配
        Mobile mobile = new Mobile();

        mobile.charge(new VoltageAdapterByCombination(new Voltage220VImpl()));

    }



}
