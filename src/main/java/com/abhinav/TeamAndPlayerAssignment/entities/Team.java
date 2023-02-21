package com.abhinav.TeamAndPlayerAssignment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Team {

    @Id
    private long id;
    private String teamName;

    @OneToMany
    private List<Player> playerList;

    public Team() {}

    public Team(long id, String teamName, List<Player> playerList) {
        this.id = id;
        this.teamName = teamName;
        this.playerList = playerList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}