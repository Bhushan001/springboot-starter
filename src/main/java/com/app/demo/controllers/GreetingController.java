package com.app.demo.controllers;

import com.app.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// @Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceSpanish;
    private HelloWorldService helloWorldServiceFrench;
    private  HelloWorldService helloWorldServicePolish;
    private HelloWorldService helloWorldServiceRussian;
    private HelloWorldService helloWorldServiceGerman;

    public void setHelloWorldService(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldServiceSpanish = helloWorldServiceSpanish;
    }

    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    public void setHelloWorldServicePolish(HelloWorldService helloWorldServicePolish) {
        this.helloWorldServicePolish = helloWorldServicePolish;
    }

    public void setHelloWorldServiceRussian(HelloWorldService helloWorldServiceRussian) {
        this.helloWorldServiceRussian = helloWorldServiceRussian;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
       //  System.out.println(helloWorldServiceSpanish.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServicePolish.getGreeting());
        System.out.println(helloWorldServiceRussian.getGreeting());
        return greeting;
    }
}
