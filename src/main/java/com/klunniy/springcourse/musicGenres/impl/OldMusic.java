package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component("musicBean")
public class OldMusic implements Music {
    @Override
    public String getSong() {
        return "Old Music song";
    }
}
