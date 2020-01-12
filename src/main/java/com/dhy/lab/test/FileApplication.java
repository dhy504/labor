package com.dhy.lab.test;

public class FileApplication {


    public static void main(String[] args) {
        //想命名的原文件的路径
//        File file = new File("/Users/r1/Desktop/a.txt");
//        //将原文件更改为f:\a\b.xlsx，其中路径是必要的。注意
//        file.renameTo(new File("/Users/r1/Desktop/bbbb.txt"));


        Integer a = new Integer(100);
        System.out.println(a.hashCode());


        //
        String str = "100";
        String str2 = "100";
        String str3 = new String("100");

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

    }
}
