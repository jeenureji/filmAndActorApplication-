package com.film.industry.actorApplication.service;


import com.film.industry.actorApplication.client.CarPostClientCall;
import com.film.industry.actorApplication.dto.CarPostDto;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarForClientService {

    @Autowired
    CarPostClientCall carPostClientCall;

    public List<CarPostDto> getCar(){
        return carPostClientCall.carForSailClient();
    }
}
