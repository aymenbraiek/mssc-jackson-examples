package com.biat.msscjacksonexamples.model;


import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerTest {

    BeerDto getDto() {
      return   BeerDto.builder().
                id(UUID.randomUUID())
                .beerName("Beer Name")
                .beerStyle("Beer style")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal(12.4))
                .upc(5646565465L)
                .build();
    }
}
