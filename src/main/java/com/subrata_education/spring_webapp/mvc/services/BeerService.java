package com.subrata_education.spring_webapp.mvc.services;

import com.subrata_education.spring_webapp.mvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> getAllBeers();

    Beer getBeerById(UUID id);
}