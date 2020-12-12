package com.ivoronline.entity_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EntityApplication extends SpringBootServletInitializer {



  public static void main(String[] args) {
    SpringApplication.run(EntityApplication.class, args);
  }

}
