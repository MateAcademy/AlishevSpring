package com.klunniy.springcourse.typeOfMusic.impl;

import com.klunniy.springcourse.typeOfMusic.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component("popBean")
@Scope("singleton")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Pop music";
    }
}
