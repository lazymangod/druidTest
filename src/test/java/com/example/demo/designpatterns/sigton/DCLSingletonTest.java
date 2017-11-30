package com.example.demo.designpatterns.sigton;

import org.junit.Test;

/**
 * Created by yxy20 on 2017/11/26 1:35.
 */
public class DCLSingletonTest {

    @Test
    public void name() throws Exception {


            for (int i = 0; i < 10; i++) {
                Thread thread = new Thread(() -> DCLSingleton.getInstance());
                thread.start();
            }

            Thread.sleep(100000);

    }
}