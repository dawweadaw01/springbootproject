package com.comic.springbootproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringbootprojectApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(new Date().getTime());
    }

}
