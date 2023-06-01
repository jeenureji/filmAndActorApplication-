package com.film.industry.actorApplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FilmActorId implements Serializable {

    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "actor_id")
    private Integer actorId;
}
