package arvik.springmicroservclient.client;

import arvik.springmicroservclient.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ArvikV
 * @version 1.0
 * @since 30.03.2022
 */
@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient  client;

    @Test
    void getBeerById() {
        BeerDto beerDto = client.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }
}