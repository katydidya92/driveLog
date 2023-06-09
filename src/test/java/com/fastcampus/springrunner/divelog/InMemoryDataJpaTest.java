package com.fastcampus.springrunner.divelog;

import java.lang.annotation.*;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@IntegrationTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public @interface InMemoryDataJpaTest {
}