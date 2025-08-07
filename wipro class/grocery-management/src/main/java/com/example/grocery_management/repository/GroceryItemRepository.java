package com.example.grocery_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.grocery_management.entity.GroceryItem;

@Repository
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
