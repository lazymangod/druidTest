package com.example.demo.designpatterns.sigton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 懒汉模式线程安全
 * Created by yxy20 on 2017/11/26 1:19.
 */
public class LazySingleton {
    private static final Logger log = LoggerFactory.getLogger(LazySingleton.class);

    private static LazySingleton instance;
    public static String VARIABLE = "Hello World";

    private LazySingleton() {
        log.debug("LazySingleton is created");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
