package com.tinyxiong.tiny.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class HelloControlelrTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private String port;

    @Test
    public void home() {
        System.out.println("port:" + port);
        String body = restTemplate.getForObject("/hello", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }
}