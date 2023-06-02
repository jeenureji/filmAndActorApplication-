package com.film.industry.actorApplication.client;

import com.film.industry.actorApplication.dto.CarPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class CarPostClientCall {  // microservices using rest tamplate to connect to another application


    private final String POST_STOR_SERVICE_URL = "http://localhost:8085/sales";

    @Autowired
    RestTemplate restTemplate;

    public List<CarPostDto> carForSailClient(){
        ResponseEntity<CarPostDto[]> responseEntity =
                restTemplate.getForEntity(POST_STOR_SERVICE_URL, CarPostDto[].class);
        return Arrays.asList(Objects.requireNonNull( responseEntity.getBody()));
    }

}
