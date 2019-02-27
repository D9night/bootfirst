package com.liuxscomp.controller;

import com.liuxscomp.model.Doctor;
import com.liuxscomp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/doct")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @ResponseBody
    @PostMapping("/add")
    public int addDoctor(Doctor doctor){
        return doctorService.addDoctor(doctor);
    }
    @ResponseBody
    @GetMapping("/getdname")
    public String getDoctorById(@RequestParam(name="id",required = false,defaultValue = "0") int id){
        Doctor doctor = doctorService.selectById(id);
        if(doctor!=null && doctor.getName()!=null){
            return "hello,"+doctor.getName();
        }
        return "hello"+"第一个用户";
    }
    @ResponseBody
    @GetMapping("/getone")
    public String getLastDoctor(){
        Doctor doctor = doctorService.selectLastOne();
        if(doctor != null && doctor.getName() != null){
            return "hello"+doctor.getName();
        }
        return "hello,"+"第一个用户";
    }
}
