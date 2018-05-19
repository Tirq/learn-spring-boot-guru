package com.tirq.springbootguru.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:fake.properties")
public class FakeConfig {

    @Value("${key.user}")
    String user;
    @Value("${key.city}")
    String city;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeData buildFakeData() {
        return new FakeData(user, city);
    }
}
