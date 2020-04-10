package com.biat.msscjacksonexamples.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerTest {
    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder().
                id(UUID.randomUUID())
                .beerName("Beer Name")
                .beerStyle("Beer style")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal(12.4))
                .upc(5646565465L)
                .localDate(LocalDate.now())
                .build();
    }
}
