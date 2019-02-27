package com.liuxscomp.dao;

import com.liuxscomp.model.Doctor;

public interface DoctorDao {
    //插入一条记录
    int insert(Doctor doctor);
    //查询一条记录
    Doctor queryById(int id);
    //查询最新的一条记录
    Doctor queryLast();
}
