package com.film.industry.actorApplication.repository;


import com.film.industry.actorApplication.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Integer> {



    List<Actor> findAll();



}
