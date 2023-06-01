package com.film.industry.actorApplication.service;

import com.film.industry.actorApplication.model.Actor;
import com.film.industry.actorApplication.model.FilmActor;
import com.film.industry.actorApplication.repository.FilmActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmActorService {
    @Autowired
    FilmActorRepository filmActorRepository;

    public List<FilmActor> findAllFilmActors(){
        return filmActorRepository.findAll();
    }

}
