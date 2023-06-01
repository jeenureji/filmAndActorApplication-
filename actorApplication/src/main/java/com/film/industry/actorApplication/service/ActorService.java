package com.film.industry.actorApplication.service;


import com.film.industry.actorApplication.dto.ActorDto;
import com.film.industry.actorApplication.model.Actor;
import com.film.industry.actorApplication.repository.ActorRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ActorService {
    private static final Logger logger = LoggerFactory.getLogger(ActorService.class);
    @Autowired
    ActorRepository actorRepository;

    public List<Actor> findAllActors(){
        return actorRepository.findAll();
    }

    public List<ActorDto> findActor(Integer actorId) {
        List<ActorDto> findActorById = new ArrayList<>();
        actorRepository.findById(actorId).ifPresentOrElse(a -> {
            findActorById.add(getActorById(a));
        }, () -> {
            throw new RuntimeException();
        });
        return findActorById;
    }
public ActorDto getActorById(Actor actor){
return ActorDto.builder()
        .actorId(actor.getActorId())
        .firstName(actor.getFirstName())
        .lastName(actor.getLastName())
        .last_update(actor.getLast_update()).build();
}
}
