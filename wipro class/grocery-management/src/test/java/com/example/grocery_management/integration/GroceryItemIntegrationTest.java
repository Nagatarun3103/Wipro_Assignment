package com.example.grocery_management.integration;

import com.example.grocery_management.entity.GroceryItem;
import com.example.grocery_management.repository.GroceryItemRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GroceryItemIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    GroceryItemRepository repository;

    private String getUrl(String path) {
        return "http://localhost:" + port + path;
    }

    @BeforeEach
    void setup() {
        repository.deleteAll();
    }

    @Test
    void testCreateAndGetItem() {
        GroceryItem item = new GroceryItem("Kiwi", 3, 3.33);

        ResponseEntity<GroceryItem> createResp = restTemplate.postForEntity(getUrl("/api/grocery"), item, GroceryItem.class);
        assertEquals(HttpStatus.OK, createResp.getStatusCode());
        assertNotNull(createResp.getBody().getId());

        Long id = createResp.getBody().getId();
        ResponseEntity<GroceryItem> getResp = restTemplate.getForEntity(getUrl("/api/grocery/" + id), GroceryItem.class);
        assertEquals(HttpStatus.OK, getResp.getStatusCode());
        assertEquals("Kiwi", getResp.getBody().getName());
    }

    @Test
    void testUpdateAndDelete() {
        GroceryItem item = new GroceryItem("Mango", 10, 5.55);
        GroceryItem created = restTemplate.postForEntity(getUrl("/api/grocery"), item, GroceryItem.class).getBody();
        assertNotNull(created);
        Long id = created.getId();

        GroceryItem update = new GroceryItem("Papaya", 20, 4.44);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<GroceryItem> entity = new HttpEntity<>(update, headers);

        ResponseEntity<GroceryItem> updResp = restTemplate.exchange(getUrl("/api/grocery/" + id), HttpMethod.PUT, entity, GroceryItem.class);
        assertEquals(HttpStatus.OK, updResp.getStatusCode());
        assertEquals("Papaya", updResp.getBody().getName());

        ResponseEntity<Void> delResp = restTemplate.exchange(getUrl("/api/grocery/" + id), HttpMethod.DELETE, null, Void.class);
        assertEquals(HttpStatus.NO_CONTENT, delResp.getStatusCode());

        ResponseEntity<GroceryItem> getResp = restTemplate.getForEntity(getUrl("/api/grocery/" + id), GroceryItem.class);
        assertEquals(HttpStatus.NOT_FOUND, getResp.getStatusCode());
    }

    @Test
    void testGetAll() {
        repository.saveAll(Arrays.asList(
                new GroceryItem("A", 1, 1.0),
                new GroceryItem("B", 2, 2.0)
        ));
        ResponseEntity<GroceryItem[]> resp = restTemplate.getForEntity(getUrl("/api/grocery"), GroceryItem[].class);
        assertEquals(2, Objects.requireNonNull(resp.getBody()).length);
    }
}
