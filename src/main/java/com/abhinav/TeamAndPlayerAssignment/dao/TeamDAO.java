package com.abhinav.TeamAndPlayerAssignment.dao;

import com.abhinav.DoctorAssignment.entities.Doctor;
import com.abhinav.TeamAndPlayerAssignment.entities.Team;
import com.abhinav.TeamAndPlayerAssignment.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class TeamDAO {

    @Autowired
    private TeamRepository repository;

    public List<Team> fetchAll() {
        return repository.findAll();
    }

    public Optional<Team> find(Long id) {
        return repository.findById(id);
    }

    public Team save(Team team) {
        return repository.save(team);
    }
}
