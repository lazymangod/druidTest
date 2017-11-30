package com.example.demo.dao.impl;

import com.example.demo.dao.ActorDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 4:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class ActorDaoImplTest {

    @Autowired
    private ActorDao actorDao;

    @Test
    public void findActorById() throws Exception {

    }

    @Test
    public void createActor() throws Exception {
    }

    @Test
    public void deleteActorById() throws Exception {
    }

    @Test
    public void updateActor() throws Exception {
    }

    @Test
    public void count() throws Exception {
        Integer count = actorDao.count();
        System.out.println("count = " + count);
    }

}