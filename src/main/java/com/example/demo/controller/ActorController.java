package com.example.demo.controller;

import com.example.demo.dao.ActorDao;
import com.example.demo.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 5:12
 */
@RestController
public class ActorController {

    @Autowired
    private ActorDao actorDao;

    @GetMapping("/actor/{id}")
    Actor findById(@PathVariable int id) {
        return actorDao.findActorById(id);
    }

}
