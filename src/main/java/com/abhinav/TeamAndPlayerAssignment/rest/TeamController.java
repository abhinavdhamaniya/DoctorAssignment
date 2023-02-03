package com.abhinav.TeamAndPlayerAssignment.rest;

import com.abhinav.DoctorAssignment.entities.Doctor;
import com.abhinav.TeamAndPlayerAssignment.dao.PlayerDAO;
import com.abhinav.TeamAndPlayerAssignment.dao.TeamDAO;
import com.abhinav.TeamAndPlayerAssignment.entities.Player;
import com.abhinav.TeamAndPlayerAssignment.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamDAO teamDAO;

    @Autowired
    private PlayerDAO playerDAO;

    @GetMapping("/list")
    public List<Team> fetchAll() {
        return teamDAO.fetchAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> obtainTeamById(@PathVariable Long id) {
        return teamDAO.find(id);
    }

    @PostMapping("/create")
    Team create(@RequestBody Team team) {
        return teamDAO.save(team);
    }

    @PostMapping("/player/create")
    Player create(@RequestBody Player player) {
        return playerDAO.save(player);
    }
}
