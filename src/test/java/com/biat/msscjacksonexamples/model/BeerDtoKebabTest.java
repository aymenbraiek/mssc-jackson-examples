package com.biat.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.corba.se.spi.oa.ObjectAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BeerTest {


    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonKebab=objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonKebab);

    }
}
