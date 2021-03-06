package com.anderl;

import com.anderl.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {ExternalPropsConfig.class, ScheduleConfig.class, WebFilterConfig.class, WebJsfConfig.class, WebSecurityConfig.class})
@ComponentScan({"com.anderl.config", "com.anderl.service"})
public class MessagingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagingTestApplication.class);
    }
}