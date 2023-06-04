package com.klunniy.springcourse.model.impl;

import com.klunniy.springcourse.model.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("doing my destroy");
    }
}
