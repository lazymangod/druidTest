package com.example.demo.designpatterns.sigton;

import org.junit.Test;

/**
 * Created by yxy20 on 2017/11/26 0:50.
 */
public class SingletonTest {


    @Test
    public void name() throws Exception {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> Singleton.getInstance());
            thread.start();
        }

        Thread.sleep(10000);

    }


    @Test
    public void times() throws Exception {

        for (int i = 0; i < 10; i++) {
            String message = Singleton.MESSAGE;
            System.out.println("message = " + message);
            Thread.sleep(10000);
            Singleton instance = Singleton.getInstance();
        }

    }
}