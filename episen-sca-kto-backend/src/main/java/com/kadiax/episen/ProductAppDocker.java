package com.kadiax.episen;

import com.kadiax.episen.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class ProductAppDocker {

    @Bean
    @Autowired
    RedisTemplate<String, Order> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

        if (null == redisConnectionFactory) {
            System.out.println("Redis Template Service is not available");
            return null;
        }
        RedisTemplate<String, Order> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
    public static void main(String[] args) {
        SpringApplication.run(ProductAppDocker.class, args);
    }

}
