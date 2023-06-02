package com.example.redisexample.controller;

import com.example.redisexample.models.Teams;
import com.example.redisexample.service.TeamsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/teams")
@AllArgsConstructor
public class TeamsController {

    private TeamsService teamsService;

//    @PostMapping(value = "/add")
//    public void add(Teams team){
//        teamsRepositoryImpl.add(team);
//    }

    @GetMapping("/getall")
    public  Teams getAll(){
        Teams teams = teamsService.getAll();
        return teams;
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody Teams team){
        teamsService.add(team);
    }




}
