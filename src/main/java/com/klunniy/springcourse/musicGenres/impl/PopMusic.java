package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;

/**
 * @author Serhii Klunniy
 */
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Pop music";
    }
}
