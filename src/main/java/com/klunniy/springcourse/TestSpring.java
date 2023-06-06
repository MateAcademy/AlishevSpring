package com.klunniy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {


        }

    }

}
