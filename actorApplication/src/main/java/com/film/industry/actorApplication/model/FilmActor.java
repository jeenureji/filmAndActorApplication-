package com.film.industry.actorApplication.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_actor")
public class FilmActor {

    @EmbeddedId
    private FilmActorId Id;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    private Actor actor;



//   @OneToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "film_id")
//
//   private Film film;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name ="actor_id" )
//    private Actor actor;


    @Column(name = "last_update")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SS")
    private LocalDateTime last_update;

    public FilmActor(Film film, Actor actor){
        this.film = film;
        this.actor = actor;
        this.Id = new FilmActorId(film.getFilmId(), actor.getActorId());
    }
}
