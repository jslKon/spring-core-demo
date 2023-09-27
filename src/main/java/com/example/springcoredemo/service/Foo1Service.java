package com.example.springcoredemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Foo1Service {

    public int get5() {
        return 5;
    }
}
