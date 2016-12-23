package br.com.richardcsantana.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author richard.santana
 */
@RestController
public class HelloController {

    @Value("${message}")
    private String message;

    @Value("${error}")
    private boolean error;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "hystrix")
    public String index(){
        final Random random = new Random();
        if(this.error && random.nextBoolean()) {
            throw new IllegalArgumentException();
        }
        return this.message;
    }

    public String hystrix(){
        return "Hello Hystrix" ;
    }

}
