package com.film.industry.actorApplication.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "film_id")
    private Integer filmId;

//    @OneToMany( fetch = FetchType.LAZY )
//    @JoinColumn(name = "film_id")
//    private FilmActor filmActor;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name ="actor_id" )
//    private Actor actor;

    @Column(name = "title")
    private String title;
    @Column(name ="description" )
    private String description;

    @Column(name = "release_year")
    private Integer release_year;

    @Column(name = "language_id")
    private Integer language_id;

    @Column(name = "rental_duration")
    private Integer rental_duration;

    @Column(name = "rental_rate")
    private double rental_rate;

    @Column(name = "length")
    private Integer length;

    @Column(name = "replacement_cost")
    private double replacement_cost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "last_update")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SS")
    private LocalDateTime last_update;




}
