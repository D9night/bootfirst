package com.liuxscomp.service;

import com.liuxscomp.model.Doctor;

public interface DoctorService {
    int addDoctor(Doctor doctor);
    Doctor selectById(int id);
    Doctor selectLastOne();
}
