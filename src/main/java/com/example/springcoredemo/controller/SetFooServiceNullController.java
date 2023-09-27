package com.example.springcoredemo.controller;

import com.example.springcoredemo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class SetFooServiceNullController {

    private FooService fooService;

    @Autowired
    public void setFooService(FooService fooService) {
        this.fooService = fooService;
    }

    @Scheduled(fixedRate = 2000)
    public void setNullToFooRepoInFooService() {
        fooService.setFooRepo(null);
    }
}
