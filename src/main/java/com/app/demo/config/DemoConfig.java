package com.app.demo.config;

import com.app.demo.services.HelloWorldService;
import com.app.demo.services.HelloWorldServiceEnglishImpl;
import com.app.demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DemoConfig {

    @Bean
    @Profile({"default","english"})
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile({"spanish"})
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
