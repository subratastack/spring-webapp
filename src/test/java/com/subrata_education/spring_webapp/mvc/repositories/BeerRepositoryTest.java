package com.subrata_education.spring_webapp.mvc.repositories;

import com.subrata_education.spring_webapp.mvc.model.Beer;
import com.subrata_education.spring_webapp.mvc.model.BeerStyle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

    @Test
    void saveTestBeer() {
        Beer savedBeer = beerRepository.save(Beer.builder()
                .beerName("Carlberg").build());

        assertThat(savedBeer).isNotNull();
        assertThat(savedBeer.getId()).isNotNull();
    }

    @Test
    void testSaveBeerNameTooLong() {

        assertThrows(DataIntegrityViolationException.class, () -> {
            Beer savedBeer = beerRepository.save(Beer.builder()
                    .beerName("hjkdfswhjkdfshjkdfshjkkfhjkwhjkdfshjkdsghadhjkajkasdjhjladshjashjkasadshjkadjsladjsklajklsklasklasdlkasljkasljk")
                    .beerStyle(BeerStyle.LAGER)
                    .price(new BigDecimal("45.45"))
                    .build());

            beerRepository.flush();
        });
    }
}