package com.travel.mate.project.service;

import com.travel.mate.project.model.Places;
import com.travel.mate.project.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlacesService {
    @Autowired
    private PlacesRepository placesRepository;
    public List<String> getAllStates() {
        return placesRepository.getAllState();
    }
    public List<Places> getAllPlaces() {
        return placesRepository.findAll();
    }


    public List<Places> getAllCity(String state) {
        return placesRepository.findByState(state);

    }

    public List<Places> getAllPlaces(String city) {
        return placesRepository.findByCity(city);

    }

    public List<Places> create(List<Places> places) {
        return placesRepository.saveAll(places);
    }
}
