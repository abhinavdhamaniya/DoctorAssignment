package com.abhinav.DoctorAssignment.dao;

import com.abhinav.DoctorAssignment.entities.Doctor;
import com.abhinav.DoctorAssignment.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DoctorDAO {

    @Autowired
    private DoctorRepository repository;

    public List<Doctor> list() {
        return repository.findAll();
    }

    public Doctor save(Doctor doctor) {
        return repository.save(doctor);
    }

}
