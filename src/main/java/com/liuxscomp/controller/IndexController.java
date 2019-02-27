package com.liuxscomp.controller;

import com.liuxscomp.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/chind")
public class IndexController {

    @RequestMapping(value = "/windowopen")
    public String getIndex(){
        return "/index";
    }
    @ResponseBody
    @GetMapping(value = "/tologin")
    public String toLogin(){
        return "hello,已经登陆";
    }
}
