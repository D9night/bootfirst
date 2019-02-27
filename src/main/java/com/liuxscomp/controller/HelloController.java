package com.liuxscomp.controller;

import com.liuxscomp.model.Doctor;
import com.liuxscomp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping("/hello")
    public String index(){
        Doctor doctor = doctorService.selectLastOne();
        if(doctor != null && doctor.getName() != null){
            return "hello,"+doctor.getName();
        }
        return "hello"+"第一个用户";
    }
}
