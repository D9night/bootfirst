package com.liuxscomp.service.impl;

import com.liuxscomp.dao.DoctorDao;
import com.liuxscomp.model.Doctor;
import com.liuxscomp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public int addDoctor(Doctor doctor) {
        doctorDao.insert(doctor);
        return doctor.getId();
    }

    @Override
    public Doctor selectById(int id) {
        return doctorDao.queryById(id);
    }

    @Override
    public Doctor selectLastOne() {
        return doctorDao.queryLast();
    }
}
