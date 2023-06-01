package com.film.industry.actorApplication.controller;


import com.film.industry.actorApplication.dto.ActorDto;
import com.film.industry.actorApplication.model.Actor;
import com.film.industry.actorApplication.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ActorController {
    @Autowired
    ActorService actorService;

       @GetMapping("/Actor")
       public List<Actor> getActor (){
           return actorService.findAllActors();
    }

    @GetMapping("/actor")
    public ResponseEntity<List<ActorDto>> getActorById(@RequestParam(value = "actorId") Integer actorId){
    List<ActorDto> actorDtos =  actorService.findActor(actorId);
        return new ResponseEntity<>(actorDtos, HttpStatus.FOUND);
    }
}
