package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component("oldBean")
@Scope("singleton")
public class OldMusic implements Music {
    @Override
    public String getSong() {
        return "Old Music song";
    }
}
