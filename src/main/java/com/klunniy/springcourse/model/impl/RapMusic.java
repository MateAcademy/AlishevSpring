package com.klunniy.springcourse.model.impl;

import com.klunniy.springcourse.model.Music;
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
