package com.example.springcoredemo.controller;

import com.example.springcoredemo.service.Foo1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class AutowireController {

    @Autowired
    private Foo1Service foo1Service;

    //    private final Foo2Service foo2Service;

    public int calculate() {
        int foo1Service5 = foo1Service.get5();
        log.info("Result : {}", foo1Service5);
        return foo1Service5 * 2;
    }
}
