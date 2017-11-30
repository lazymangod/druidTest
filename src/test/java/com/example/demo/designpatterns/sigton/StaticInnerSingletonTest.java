package com.example.demo.designpatterns.sigton;

import org.junit.Test;

/**
 * @author yxy20
 */
public class StaticInnerSingletonTest {
    @Test
    public void getInstance() throws Exception {
        for (int i = 0; i < 10; i++) {


            Thread thread = new Thread(() -> {
                    StaticInnerSingleton a = StaticInnerSingleton.getInstance();
                    System.out.println("a = " + a);
            });
            thread.start();
        }

        Thread.sleep(10000);
    }

}