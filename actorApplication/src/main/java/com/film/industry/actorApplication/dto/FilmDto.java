package com.film.industry.actorApplication.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {

    private Integer filmId;

    private String title;

    private String description;

    private Integer release_year;

    private Integer language_id;

    private Integer rental_duration;

    private double rental_rate;

    private Integer length;

    private double replacement_cost;

    private String rating;

    private LocalDateTime last_update;
}
