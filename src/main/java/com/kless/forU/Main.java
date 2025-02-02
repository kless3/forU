package com.kless.forU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Main {

    @GetMapping("/")
    public String getMainPage(){
        return "main";
    }


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
