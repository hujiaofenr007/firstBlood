package com.hujiao.firstblood.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @GetMapping(value = "/getObject")
    public Object getObject(){
        return "hello world";
    }
}
