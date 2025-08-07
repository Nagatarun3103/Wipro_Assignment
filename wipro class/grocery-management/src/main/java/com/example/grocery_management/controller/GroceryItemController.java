package com.example.grocery_management.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.grocery_management.entity.GroceryItem;
import com.example.grocery_management.service.GroceryItemService;

import java.util.List;

@RestController
@RequestMapping("/api/grocery")
public class GroceryItemController {

    private final GroceryItemService service;

    public GroceryItemController(GroceryItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<GroceryItem> createItem(@Valid @RequestBody GroceryItem item) {
        GroceryItem created = service.create(item);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<GroceryItem>> getAllItems() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroceryItem> getItemById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateItem(@PathVariable Long id, @Valid @RequestBody GroceryItem item) {
        try {
            GroceryItem updated = service.update(id, item);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
