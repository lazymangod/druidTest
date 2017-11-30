package com.example.demo;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;

/**
 * Created by yxy20 on 2017/11/25 14:24.
 */
public class TestRunTest {
    @Test
    public void getInstance() throws Exception {
        String[] args = new String[1];
        args[0] = "root";
        ConfigTools.main(args);

    }

}

