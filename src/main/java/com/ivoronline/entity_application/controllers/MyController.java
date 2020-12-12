package com.ivoronline.entity_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @RequestMapping("/hello")
  public String sayHello() {
    return "index";
  }

}
