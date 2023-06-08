package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component("rapBean")
@Scope("singleton")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap music song";
    }
}
