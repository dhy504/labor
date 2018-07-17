package com.dhy.lab.sort;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {
        //数据准备
        CarDealerInfo carDealerInfo1 = new CarDealerInfo("温州车商加盟店", "浙江省", "温州市", 1);
        CarDealerInfo carDealerInfo2 = new CarDealerInfo("杭州车商加盟店", "浙江省", "杭州市", 1);
        CarDealerInfo carDealerInfo2zhiying = new CarDealerInfo("杭州车商直营店", "浙江省", "杭州市", 2) ;
        CarDealerInfo carDealerInfo3 = new CarDealerInfo("厦门车商加盟店", "福建省", "厦门市", 1);
        CarDealerInfo carDealerInfo3zhiying = new CarDealerInfo("厦门车商直营店", "福建省", "福鼎市", 2);

        //排序
        List<CarDealerInfo> paramList = new ArrayList<>();
        paramList.add(carDealerInfo1);
        paramList.add(carDealerInfo2);
        paramList.add(carDealerInfo2zhiying);
        paramList.add(carDealerInfo3);
        paramList.add(carDealerInfo3zhiying);

        SortTest sortTest = new SortTest();
        List<CarDealerInfo> result = sortTest.sortList("福建省", "福州市", paramList);

        System.out.println("结果" + JSON.toJSONString(result));


    }


    /**
     * @Description: 按一定规则进行排序。先去本市的直营店、加盟店，再本省的直营店、加盟店，再全国的。涉及四个list，一次遍历，有待提升的排序方法
     * @Param areaProvinceName 待选的省份名称
     * @Param areaCityName 待选的城市名称
     * @Param paramList 参数list
     * @Return 分页结果
     * @Author  Dong_hy
     * @Date 2018/7/17 20:56
     */
    public List<CarDealerInfo> sortList(String areaProvinceName, String areaCityName, List<CarDealerInfo> paramList) {

        List<CarDealerInfo> listPAndC = new ArrayList<>();
        List<CarDealerInfo> listP = new ArrayList<>();
        List<CarDealerInfo> listAnother = new ArrayList<>();

        List<CarDealerInfo> result = new ArrayList<>();

        for (CarDealerInfo carDealerInfo : paramList) {
            if (areaProvinceName.equals(carDealerInfo.getProvinceName())) {

                if (areaCityName.equals(carDealerInfo.getCityName())) {
                    //省、市对应的list
                    listPAndC.add(carDealerInfo);
                    continue;
                }
                //省对应的list
                listP.add(carDealerInfo);
                continue;
            }

            listAnother.add(carDealerInfo);
        }

        listPAndC.sort(new Comparator<CarDealerInfo>() {
            public int compare(CarDealerInfo o1, CarDealerInfo o2) {

                return o1.getJoinType().compareTo(o2.getJoinType());
            }
        });

        result.addAll(listPAndC);
        result.addAll(listP);
        result.addAll(listAnother);

        return result;


    }
}
