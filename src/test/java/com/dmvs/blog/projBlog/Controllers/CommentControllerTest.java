package com.dmvs.blog.projBlog.Controllers;

import com.dmvs.blog.projBlog.Services.CommentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CommentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CommentService service;

}