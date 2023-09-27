package com.example.springcoredemo.service;

import com.example.springcoredemo.repository.FooRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FooService {

    private FooRepo fooRepo;

    @Autowired
    public void setFooRepo(FooRepo fooRepo) {
        this.fooRepo = fooRepo;
    }

    public void print5() {
        log.info("FooService print5: {}", fooRepo.get5());
    }
}
