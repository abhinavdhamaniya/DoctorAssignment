package com.abhinav.DoctorAssignment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Doctor {
    @Id
    private int id;
    private String name;
    private String qualification;
    private double experience;
    private String specialization;
    private double consultingFees;

    public Doctor(int id, String name, String qualification, double experience, String specialization, double consultingFees) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
        this.specialization = specialization;
        this.consultingFees = consultingFees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultingFees() {
        return consultingFees;
    }

    public void setConsultingFees(double consultingFees) {
        this.consultingFees = consultingFees;
    }
}