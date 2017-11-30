package com.example.demo.enumtest;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 3:00
 */
public enum CarEnum {

    BMW("宝马"), TOYOTA("丰田"), FIAT("菲亚特"),HONDA("本田");
    private String CarType;

    private CarEnum(String CarType) {
        this.CarType = CarType;
    }

    public String getCarType() {
        return CarType;
    }
}