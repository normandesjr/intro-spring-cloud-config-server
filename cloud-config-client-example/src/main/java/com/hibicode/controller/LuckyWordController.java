package com.hibicode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

  @Value("${service-url}") 
  private String serviceUrl;
  

  @GetMapping("/something")
  public String showServiceUrl() {
    return "The url is: " + serviceUrl;
  }
}
