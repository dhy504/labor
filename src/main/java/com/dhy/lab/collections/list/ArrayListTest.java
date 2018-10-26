package com.dhy.lab.collections.list;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {


    /**
     * set方法是引用注入。
     */
    public void setTest(){

        List<UserDTO> testList = new ArrayList<>();


        UserDTO userDTO = new UserDTO();
        userDTO.setName("Tom");
        userDTO.setAge(12);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setName("Tim");
        userDTO2.setAge(20);
        testList.add(userDTO);
        testList.set(0, userDTO2);

        System.out.println("原先" + JSON.toJSONString(testList));

        //修改对象会改变原list中的值
        userDTO2.setName("dhy");
        System.out.println("修改" + JSON.toJSONString(testList));
    }


    public void addTest(){

        List<UserDTO> testList = new ArrayList<>(0);

        UserDTO userDTO = new UserDTO();
        userDTO.setName("Tom");
        userDTO.setAge(12);


        UserDTO userDTO2 = new UserDTO();
        userDTO2.setName("Tom");
        userDTO2.setAge(12);
        testList.add(userDTO);
        testList.add(userDTO2);

        System.out.println("结果;" + JSON.toJSONString(testList));


    }


    public static void main(String[] args) {

        ArrayListTest arrayListTest = new ArrayListTest();

        arrayListTest.addTest();



    }
}
