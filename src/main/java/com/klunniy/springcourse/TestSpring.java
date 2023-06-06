package com.klunniy.springcourse;

import com.klunniy.springcourse.model.impl.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);

        }

    }

}
