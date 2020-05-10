package com.bo.controller;

import com.bo.result.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/result")
    public R getResult(){
        return R.ok();
    }

    @RequestMapping("/exception")
    public R getException(){
        throw new NullPointerException();
    }
}
