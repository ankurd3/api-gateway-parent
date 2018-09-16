package com.tech.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Spring boot app.
 *
 * @author Ankur Dutta 2016/09/16
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
