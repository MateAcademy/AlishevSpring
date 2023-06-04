package com.klunniy.springcourse.model.impl;

import com.klunniy.springcourse.model.PlayFootball;
import lombok.Data;

/**
 * @author Serhii Klunniy
 */
@Data
public class UkraineFootball implements PlayFootball {

    private String name;

    @Override
    public String play() {
        return "Kiev football team: " + name;
    }

    public void doMyInit() {
        System.out.println("init method");
    }

    public void doMyDestroy() {
        System.out.println("destroy method");
    }
}
