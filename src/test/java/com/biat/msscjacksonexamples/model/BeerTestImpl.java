package com.biat.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerTestImpl extends BeerTest {



    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {
        String jsonString = "{\"beerId\":\"6c7a1f16-9f51-40ad-9e2b-3fc23104c04b\",\"beerName\":\"Beer Name\",\"beerStyle\":\"Beer style\",\"upc\":5646565465,\"price\":12.4000000000000003552713678800500929355621337890625,\"createdDate\":\"2020-04-10T16:05:19.883+01:00\",\"lastUpdatedDate\":\"2020-04-10T16:05:19.883+01:00\"}\n";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println("deserialize" + beerDto.toString());
    }
}
