package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// 출력 로그
@Slf4j
public class DependencyTest {
    // 필드 주입
    @Autowired
    private Coding coding;

    @Autowired
    private Chef chef;

    @Autowired
    private Restaurant restaurant;

    @Test
    public void dependencyTest(){
        log.info(coding+ "");
        log.info(chef+ "");
        log.info(restaurant+ "");
    }

}
