package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap music song";
    }
}
