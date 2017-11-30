package com.example.demo.designpatterns.sigton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 双重校验锁DCL
 * Created by yxy20 on 2017/11/26 1:25.
 */
public class DCLSingleton {

    private static final Logger log = LoggerFactory.getLogger(DCLSingleton.class);


    /**
     * 此处必须添加volatile关键字 线程A在创建单例对象时，在构造方法被调用之前，就为 该对象分配了内存空间并将对象设置为默认值。此时线程A就可以将
     * 分配的内存地址赋值给 instance字段了，然而该对象可能还没有完成初始化操作。线程B来调用newInstance()方法，得到的 就是未初始化完全的单例
     * 对象，这就会导致系统出现异常行为。
     */
    private volatile static DCLSingleton instance;

    private DCLSingleton() {
        log.debug("DCLSingleton is created");
    }


    public static DCLSingleton getInstance() {
        if (instance == null) {

            synchronized (DCLSingleton.class) {
                //如果不加这一层判断的话，这样的话每一个线程会得到一个实例
                //而不是所有的线程的到的是一个实例
                if (instance == null) {
                    try {
                        //模拟初始化对象的准备时间...
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new DCLSingleton();
                }

            }
        }
        log.debug("instance = {}",instance);
        return instance;
    }
}
