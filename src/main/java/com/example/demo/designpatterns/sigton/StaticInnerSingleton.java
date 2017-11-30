package com.example.demo.designpatterns.sigton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yxy20 on 2017/11/26 1:54
 */
public class StaticInnerSingleton {
    private static final Logger log = LoggerFactory.getLogger(StaticInnerSingleton.class);

    private StaticInnerSingleton() {
        log.debug("StaticInnerSingleton is created");
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}

