package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest//json environment to work with
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    public void deserielizeDto() throws IOException {
        String json = "{\"beerName\":\"Beer name\",\"beerStyle\":\"Ale\",\"upc\":1231200000,\"price\":\"12.33\",\"createdDate\":\"2021-03-18T16:49:52+0200\",\"lastUpdatedDate\":\"2021-03-18T16:49:52.023033+02:00\",\"myLocalDate\":\"20210318\",\"beerId\":\"10926aa7-7c9b-459a-82fe-1b38ca4a858a\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}