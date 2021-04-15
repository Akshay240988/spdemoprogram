package com.spfirstprogram.spdemoprogram.controller;

import com.spfirstprogram.spdemoprogram.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // = @Controller + @ResponseBody
public class MyController {
    @Autowired   //Using spring's dependency injection facilities
    private MyImpl myImpl;   //Field based DI

    @GetMapping("/checking")
    public String check(){
        return myImpl.getData();
    }
}
