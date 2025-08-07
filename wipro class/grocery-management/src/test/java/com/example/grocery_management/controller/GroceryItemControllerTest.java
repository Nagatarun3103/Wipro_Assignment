package com.example.grocery_management.controller;

import com.example.grocery_management.entity.GroceryItem;
import com.example.grocery_management.service.GroceryItemService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GroceryItemController.class)
class GroceryItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GroceryItemService service;

    @Test
    void testGetAllItems() throws Exception {
        List<GroceryItem> items = Arrays.asList(
                new GroceryItem("Apple", 5, 1.5),
                new GroceryItem("Banana", 8, 2.0)
        );
        when(service.getAll()).thenReturn(items);

        mockMvc.perform(get("/api/grocery"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Apple"))
                .andExpect(jsonPath("$[1].name").value("Banana"));
    }

    @Test
    void testCreateItem() throws Exception {
        GroceryItem item = new GroceryItem("Milk", 2, 1.25);
        item.setId(1L);
        when(service.create(any(GroceryItem.class))).thenReturn(item);

        String json = """
                {"name":"Milk","quantity":2,"price":1.25}
                """;
        mockMvc.perform(post("/api/grocery")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Milk"))
                .andExpect(jsonPath("$.quantity").value(2));
    }

    @Test
    void testGetItemByIdFound() throws Exception {
        GroceryItem item = new GroceryItem("Juice", 1, 2.0);
        item.setId(10L);
        when(service.getById(10L)).thenReturn(Optional.of(item));

        mockMvc.perform(get("/api/grocery/10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Juice"));
    }

    @Test
    void testGetItemByIdNotFound() throws Exception {
        when(service.getById(100L)).thenReturn(Optional.empty());
        mockMvc.perform(get("/api/grocery/100"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testUpdateItem() throws Exception {
        GroceryItem item = new GroceryItem("Butter", 4, 2.99);
        item.setId(50L);
        when(service.update(eq(50L), any(GroceryItem.class))).thenReturn(item);

        String json = """
                {"name":"Butter","quantity":4,"price":2.99}
                """;
        mockMvc.perform(put("/api/grocery/50")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Butter"));
    }

    @Test
    void testDeleteItem() throws Exception {
        doNothing().when(service).delete(10L);
        mockMvc.perform(delete("/api/grocery/10"))
                .andExpect(status().isNoContent());
    }
}
