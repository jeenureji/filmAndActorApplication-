package com.film.industry.actorApplication.controller;

import com.film.industry.actorApplication.model.FilmActor;
import com.film.industry.actorApplication.service.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmActorController {

    @Autowired
    FilmActorService filmActorService;

    @GetMapping("/filmActor")
    public List<FilmActor> findallFilmActor(){
        return filmActorService.findAllFilmActors();
    }

}
