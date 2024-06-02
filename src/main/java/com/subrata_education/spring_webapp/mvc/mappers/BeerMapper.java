package com.subrata_education.spring_webapp.mvc.mappers;

import com.subrata_education.spring_webapp.mvc.dto.BeerDTO;
import com.subrata_education.spring_webapp.mvc.model.Beer;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);
    BeerDTO beerToBeerDto(Beer beer);
}
