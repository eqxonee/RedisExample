package com.example.redisexample.service;

import com.example.redisexample.models.Teams;

import java.util.List;

public interface TeamsService {

    Teams getAll();

     void add(Teams team);
}
