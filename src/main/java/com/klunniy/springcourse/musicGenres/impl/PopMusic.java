package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
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
