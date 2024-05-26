package com.subrata_education.spring_webapp.mvc.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}