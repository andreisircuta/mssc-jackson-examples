package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.UUID;

public class BaseTest {
    BeerDto getBeerDto(){
        return BeerDto.builder()
                .beerName("Beer name")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.33"))
                .upc(1231200000L)
                .build();
    }
}
