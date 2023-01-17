package com.ola_spring.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {
  @GetMapping
  public String GetHealth() {
    return "Olá Spring";
  }
}
