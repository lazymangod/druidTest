package com.example.demo.dao;

import com.example.demo.domain.Actor;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 4:31
 */
public interface ActorDao {
    Actor findActorById(int actorId);
    void createActor(Actor actor);
    void deleteActorById(int actorId);
    void updateActor(Actor actor);

    Integer count();
}
