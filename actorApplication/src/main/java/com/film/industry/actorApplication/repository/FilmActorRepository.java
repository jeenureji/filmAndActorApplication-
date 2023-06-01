package com.film.industry.actorApplication.repository;


import com.film.industry.actorApplication.model.Actor;
import com.film.industry.actorApplication.model.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FilmActorRepository extends JpaRepository <FilmActor, Integer> {

    List<FilmActor> findAll();


}
