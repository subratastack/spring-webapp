package com.subrata_education.spring_webapp.mvc.repositories;

import com.subrata_education.spring_webapp.mvc.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
