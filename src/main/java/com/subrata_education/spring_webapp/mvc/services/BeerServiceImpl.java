package com.subrata_education.spring_webapp.mvc.services;

import com.subrata_education.spring_webapp.mvc.model.Beer;
import com.subrata_education.spring_webapp.mvc.model.BeerStyle;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        beerMap = new HashMap<>();

        Beer b1 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Beer 1")
                .beerStyle(BeerStyle.LAGER)
                .price(new BigDecimal(300))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer b2 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Beer 2")
                .beerStyle(BeerStyle.PALE_ALE)
                .price(new BigDecimal(200))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer b3 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Beer 3")
                .beerStyle(BeerStyle.WHEAT)
                .price(new BigDecimal(400))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        beerMap.put(b1.getId(), b1);
        beerMap.put(b2.getId(), b2);
        beerMap.put(b3.getId(), b3);
    }

    @Override
    public List<Beer> getAllBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {
        return beerMap.get(id);
    }
}
