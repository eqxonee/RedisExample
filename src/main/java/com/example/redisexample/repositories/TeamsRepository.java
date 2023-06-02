package com.example.redisexample.repositories;

import com.example.redisexample.models.Teams;

import java.util.List;

public interface TeamsRepository {

    Teams getAll();

    void add(Teams team);
}
