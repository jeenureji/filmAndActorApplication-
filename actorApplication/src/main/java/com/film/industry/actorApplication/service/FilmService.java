package com.film.industry.actorApplication.service;


import com.film.industry.actorApplication.dto.FilmDto;
import com.film.industry.actorApplication.model.Film;
import com.film.industry.actorApplication.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    @Autowired
    FilmRepository filmRepository;

    public List<FilmDto> findFilm(){
        List<FilmDto> filmDto = new ArrayList<>();
       filmRepository.findAll().forEach(a -> {
           filmDto.add(getAllFilm(a));
       });
        return filmDto;
    }

    public FilmDto getAllFilm(Film film){

        return FilmDto.builder()
                .filmId(film.getFilmId())
                .description(film.getDescription())
                .language_id(film.getLanguage_id())
                .last_update(film.getLast_update())
                .length(film.getLength())
                .rating(film.getRating())
                .release_year(film.getRelease_year())
                .rental_duration(film.getRental_duration())
                .rental_rate(film.getRental_rate())
                .replacement_cost(film.getReplacement_cost())
                .title(film.getTitle())
                .build();
    }
}
