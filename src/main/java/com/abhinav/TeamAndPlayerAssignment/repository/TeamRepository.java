package com.abhinav.TeamAndPlayerAssignment.repository;

import com.abhinav.TeamAndPlayerAssignment.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Long> {

}