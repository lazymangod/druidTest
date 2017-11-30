package com.example.demo.dao.impl;

import com.example.demo.dao.ActorDao;
import com.example.demo.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 4:34
 */
@Repository
public class ActorDaoImpl implements ActorDao{


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Actor findActorById(int actorId) {

        Actor actor = jdbcTemplate.queryForObject("select * from actor where actor_id = ?", new Object[]{1}, new RowMapper<Actor>() {
            @Override
            public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                Actor actor = new Actor();
                actor.setActorId(rs.getInt("actor_id"));
                actor.setFirstName(rs.getString("first_name"));
                actor.setLastName(rs.getString("last_name"));
                actor.setLastUpdate(rs.getTimestamp("last_update"));
                return actor;
            }
        });
        return actor;
    }

    @Override
    public void createActor(Actor actor) {



    }

    @Override
    public void deleteActorById(int actorId) {


    }

    @Override
    public void updateActor(Actor actor) {

    }

    @Override
    public Integer count() {
        int count = jdbcTemplate.queryForObject("select count(*) from actor", Integer.class);
        return count;
    }
}
