package com.example.demo.enumtest;

import org.junit.Test;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 3:05
 */
public class CarEnumTest {
    @Test
    public void name() throws Exception {
    }

    @Test
    public void getCarType() throws Exception {



        String carType1 = CarEnum.HONDA.getCarType();
        System.out.println("carType1 = " + carType1);
    }

}