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
//        assertEquals("{\"id\":\"6fcea6d4-8556-4792-98c5-dc48f8bad3eb\",\"beerName\":\"Beer name\",\"beerStyle\":\"Ale\",\"upc\":1231200000,\"price\":12.33,\"createdDate\":\"2021-03-18T15:40:50.475332+02:00\",\"lastUpdatedDate\":\"2021-03-18T15:40:50.476003+02:00\"}",
//                jsonString);
    }

    @Test
    public void deserielizeDto() throws IOException {
        String json = "{\"beerId\":\"6fcea6d4-8556-4792-98c5-dc48f8bad3eb\",\"beerName\":\"Beer name\",\"beerStyle\":\"Ale\",\"upc\":1231200000,\"price\":12.33,\"createdDate\":\"2021-03-18T15:40:50.475332+02:00\",\"lastUpdatedDate\":\"2021-03-18T15:40:50.476003+02:00\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
//        assertEquals(getBeerDto(), beerDto);
        System.out.println(beerDto);
    }
}