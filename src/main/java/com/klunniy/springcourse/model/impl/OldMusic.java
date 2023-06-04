package com.klunniy.springcourse.model.impl;

import com.klunniy.springcourse.model.Music;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component
public class OldMusic implements Music {
    @Override
    public String getSong() {
        return "Old Music song";
    }
}
