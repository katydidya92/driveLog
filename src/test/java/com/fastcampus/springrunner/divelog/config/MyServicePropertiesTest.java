package com.fastcampus.springrunner.divelog.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

// -> 삭제 시 동작안함 해당 Profiles를 찾지 못하기 때문
@ActiveProfiles("my-service")
@SpringBootTest
class MyServicePropertiesTest {

    @Test
    void test(@Autowired MyServiceProperties myServiceProperties){
        assertThat(myServiceProperties.isEnabled()).isFalse();
    }
}