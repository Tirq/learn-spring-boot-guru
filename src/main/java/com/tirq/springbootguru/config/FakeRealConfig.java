package com.tirq.springbootguru.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:fake.properties"),
        @PropertySource("classpath:real.properties")
})
public class FakeRealConfig {

    @Value("${key.user}")
    String user;
    @Value("${key.city}")
    String city;
    @Value("${real.country}")
    String country;


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeData buildFakeData() {
        return new FakeData(user, city);
    }

    @Bean
    public RealData buildRealData() {
        return new RealData(country);
    }
}
