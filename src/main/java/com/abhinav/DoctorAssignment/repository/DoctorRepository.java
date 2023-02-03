package com.abhinav.DoctorAssignment.repository;

import com.abhinav.DoctorAssignment.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}