package com.klunniy.springcourse.model.impl;

import com.klunniy.springcourse.model.Music;

/**
 * @author Serhii Klunniy
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
