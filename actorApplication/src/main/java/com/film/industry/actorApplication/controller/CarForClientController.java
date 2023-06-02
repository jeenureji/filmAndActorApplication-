package com.film.industry.actorApplication.controller;

import com.film.industry.actorApplication.dto.CarPostDto;
import com.film.industry.actorApplication.service.CarForClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarForClientController {

    @Autowired
    CarForClientService carForClientService;

    @GetMapping("/client")
    public ResponseEntity<List<CarPostDto>> getAllCarsForClient(){
        List<CarPostDto> carPostDtos =  carForClientService.getCar();
        return new ResponseEntity<>(carPostDtos, HttpStatus.FOUND);
    }
}
