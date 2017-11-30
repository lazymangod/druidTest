package com.example.demo.designpatterns.sigton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 饿汉模式单例  线程安全
 * Created by yxy20 on 2017/11/26 0:32.
 *
 * 此方法不能精确的控制instance的创建时间
*/
public class Singleton {


    private static final Logger log = LoggerFactory.getLogger(Singleton.class);

    public static final String MESSAGE= "Hello world";

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("log = " + log);
        log.debug("Singleton is created");
    }

    public static Singleton getInstance() {
        if (log.isDebugEnabled()) {
            log.debug("log= {}",log);
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Singleton.MESSAGE); //第二段
        }
    }

}
