package com.travel.mate.project.repository;

import com.travel.mate.project.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacesRepository extends JpaRepository<Places, Integer> {

    @Query("SELECT pt FROM Places pt WHERE pt.state = :state")
    List<Places> findByState(String state);

    @Query("SELECT DISTINCT pt.state FROM Places pt")
    List<String> getAllState();

    @Query("SELECT pt FROM Places pt WHERE pt.city = :city")
    List<Places> findByCity(String city);
 }
