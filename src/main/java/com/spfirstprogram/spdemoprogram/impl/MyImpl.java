package com.spfirstprogram.spdemoprogram.impl;

import com.spfirstprogram.spdemoprogram.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {
    @Override
    public String getData() {
        return "Hello Spring";
    }
}
