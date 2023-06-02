package com.example.redisexample.repositories;

import com.example.redisexample.models.Teams;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TeamsRepositoryImpl implements TeamsRepository {

    private RedisTemplate redisTemplate;

    private static final String KEY = "govno";

    public void add(Teams team){
        redisTemplate.opsForValue().set(KEY,team);
    }

    public Teams getAll(){
        Teams teams = (Teams) redisTemplate.opsForValue().get(KEY);
        return teams;
    }


}
