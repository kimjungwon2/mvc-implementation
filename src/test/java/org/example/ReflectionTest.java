package org.example;

import org.example.annotation.Controller;
import org.example.controller.Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;


public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @DisplayName("")
    @Test
    void controllerScan(){
      //given
        Reflections reflections = new Reflections("org.example");

        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflections.getTypesAnnotatedWith(Controller.class));
        beans.addAll(reflections.getTypesAnnotatedWith(Service.class));

        logger.debug("beans: [{}]",beans);
    }
}
