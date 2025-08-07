package com.example.grocery_management.service;

import org.springframework.stereotype.Service;

import com.example.grocery_management.entity.GroceryItem;
import com.example.grocery_management.repository.GroceryItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryItemService {

    private final GroceryItemRepository repository;

    public GroceryItemService(GroceryItemRepository repository) {
        this.repository = repository;
    }

    public GroceryItem create(GroceryItem item) {
        return repository.save(item);
    }

    public List<GroceryItem> getAll() {
        return repository.findAll();
    }

    public Optional<GroceryItem> getById(Long id) {
        return repository.findById(id);
    }

    public GroceryItem update(Long id, GroceryItem updatedItem) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(updatedItem.getName());
                    existing.setQuantity(updatedItem.getQuantity());
                    existing.setName(updatedItem.getName());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
