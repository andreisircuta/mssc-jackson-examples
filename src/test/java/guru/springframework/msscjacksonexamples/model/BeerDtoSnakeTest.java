package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake") //will bring the application-snake.properties
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testSnake() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }
}
