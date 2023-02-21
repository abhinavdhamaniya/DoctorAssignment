package com.abhinav.DoctorAssignment.springbootcucumber.DoctorAssignment.dao;

import com.abhinav.DoctorAssignment.dao.DoctorDAO;
import com.abhinav.DoctorAssignment.entities.Doctor;
import com.abhinav.DoctorAssignment.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DoctorDAOTest {

    @Mock
    DoctorRepository repository;

    @InjectMocks
    DoctorDAO dao;

    @Test
    void should_call_repository_to_create_doctor() {
        // Given
        Doctor doctor = new Doctor();
        doctor.setId(101);
        when(repository.save(doctor)).thenReturn(doctor);
        // When
        Doctor result = dao.save(doctor);
        // Then
        assertThat(result.getId()).isEqualTo(101);
    }

    @Test
    void should_call_repository_to_return_all_doctors() {
        // Given
        Doctor doctor = new Doctor();
        doctor.setId(101);
        List<Doctor> doctors = Collections.singletonList(doctor);
        when(repository.findAll()).thenReturn(doctors);
        // When
        List<Doctor> result = dao.list();
        // Then
        assertThat(result).extracting(Doctor::getId).containsExactly(101);
    }
}
