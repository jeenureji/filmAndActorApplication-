package com.film.industry.actorApplication.controller;


import com.film.industry.actorApplication.dto.FilmDto;
import com.film.industry.actorApplication.model.Film;
import com.film.industry.actorApplication.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/film")
    public ResponseEntity<List<FilmDto>> findAllFilms(){
        List<FilmDto> filmDtos =  filmService.findFilm();
        return new ResponseEntity<>(filmDtos, HttpStatus.FOUND);
    }
}
