package com.example.redisexample.service;


import com.example.redisexample.models.Teams;
import com.example.redisexample.repositories.TeamsRepository;
import com.example.redisexample.repositories.TeamsRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamsServiceImpl implements TeamsService{

    private final TeamsRepository teamsRepository;

    public Teams getAll(){
        return teamsRepository.getAll();
    }

    public void add(Teams team){
       teamsRepository.add(team);
    }
}
