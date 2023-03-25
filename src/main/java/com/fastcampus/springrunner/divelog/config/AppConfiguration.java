package com.fastcampus.springrunner.divelog.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties({MyServiceProperties.class})
@ConfigurationPropertiesScan // -> 자동으로 스캔
public class AppConfiguration {
}
