package com.example.springcoredemo.controller;

import com.example.springcoredemo.service.Foo1Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AutowireControllerTest {

    @InjectMocks
    AutowireController autowireControllerMock;

    @Mock
    Foo1Service foo1Service;

    @Test
    void testCalculate_withoutMock() {
        AutowireController autowireController = new AutowireController();
        Assertions.assertThrows(NullPointerException.class, autowireController::calculate);
    }

    @Test
    void testCalculate_withMock() {
        Mockito.when(foo1Service.get5()).thenReturn(5);
        Assertions.assertEquals(10, autowireControllerMock.calculate());
    }
}
