package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Saludo {
        @GetMapping("/hola")
        public String HolaMundo(){
            return  "Hola Mundo";

        }
          
}
