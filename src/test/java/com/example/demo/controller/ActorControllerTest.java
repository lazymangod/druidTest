package com.example.demo.controller;

import com.example.demo.dao.ActorDao;
import com.example.demo.domain.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import java.sql.Timestamp;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author yangxiaoyu
 * @date 2017/11/26 5:15
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ActorController.class)
public class ActorControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ActorDao actorDao;

    @Test
    public void findById() throws Exception {

        given(this.actorDao.findActorById(1)).willReturn(new Actor(1, "aa", "bb", new Timestamp(System.currentTimeMillis())));

        this.mvc.perform(get("/actor/1").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
        .andDo(new ResultHandler() {
            @Override
            public void handle(MvcResult result) throws Exception {
                MockHttpServletResponse response = result.getResponse();
                String contentAsString = response.getContentAsString();
                System.out.println("contentAsString = " + contentAsString);
            }
        });
    }

}