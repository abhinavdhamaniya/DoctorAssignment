package com.abhinav.TeamAndPlayerAssignment.dao;

import com.abhinav.TeamAndPlayerAssignment.entities.Player;
import com.abhinav.TeamAndPlayerAssignment.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerDAO {

    @Autowired
    private PlayerRepository repository;

    public Player save(Player player) {
        return repository.save(player);
    }
}
