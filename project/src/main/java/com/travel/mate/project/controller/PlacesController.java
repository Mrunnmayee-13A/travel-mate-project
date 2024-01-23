package com.travel.mate.project.controller;

import com.travel.mate.project.model.Places;
import com.travel.mate.project.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
@CrossOrigin

public class PlacesController {
    @Autowired
    private PlacesService placesService;

    @GetMapping("/all")
    public List<Places> getAllPlaces() {
        return placesService.getAllPlaces();
    }
    @GetMapping("all-states")
    public List<String> getAllStates() {
        return placesService.getAllStates();
    }

    @GetMapping("/by-state/{state}")
    public List<Places> getAllCity(@PathVariable String state) {
        return placesService.getAllCity(state);
    }
    @GetMapping("/by-city/{city}")
    public List<Places> getAllPlaces(@PathVariable String city) {
        return placesService.getAllPlaces(city);
    }
    @PostMapping("/insert")
    public List<Places> createUser(@RequestBody List<Places> places) {
             return placesService.create(places);

    }
}


