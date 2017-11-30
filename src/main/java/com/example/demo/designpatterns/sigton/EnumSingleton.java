package com.example.demo.designpatterns.sigton;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 2:48
 */
public enum EnumSingleton {

    INSTANCE;
    public void whateverMethod() {

        System.out.println("whateverMethod is calling");
        System.out.println("INSTANCE = " + INSTANCE);
    }

    private EnumSingleton() {
        System.out.println(" EnumSingleton ");
    }

}
