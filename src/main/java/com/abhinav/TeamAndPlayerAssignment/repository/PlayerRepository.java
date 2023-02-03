package com.abhinav.TeamAndPlayerAssignment.repository;

import com.abhinav.TeamAndPlayerAssignment.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("playerRepository")
public interface PlayerRepository extends JpaRepository<Player, Long> {

}