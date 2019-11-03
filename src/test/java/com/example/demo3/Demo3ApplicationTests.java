package com.example.demo3;

import com.example.demo3.dao.CatRepository;
import com.example.demo3.model.Cat;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.stream.Stream;

@SpringBootTest
class Demo3ApplicationTests {

    @Test
    void contextLoads() {
    }

}
