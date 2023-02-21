package com.abhinav.DoctorAssignment.rest;

import com.abhinav.DoctorAssignment.dao.DoctorDAO;
import com.abhinav.DoctorAssignment.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorDAO doctorDAO;

    @GetMapping("/list")
    public List<Doctor> list() {
        return doctorDAO.list();
    }

    @PostMapping("/create")
    public Doctor create(@RequestBody Doctor doctor) {
        return doctorDAO.save(doctor);
    }
}
