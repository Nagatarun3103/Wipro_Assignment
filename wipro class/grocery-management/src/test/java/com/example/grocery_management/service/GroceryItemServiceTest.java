package com.example.grocery_management.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.grocery_management.entity.GroceryItem;
import com.example.grocery_management.repository.GroceryItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.*;

class GroceryItemServiceTest {

    @Mock
    private GroceryItemRepository repository;

    @InjectMocks
    private GroceryItemService service;

    private AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreate() {
        GroceryItem item = new GroceryItem("Apple", 5, 1.5);
        when(repository.save(item)).thenReturn(item);

        GroceryItem saved = service.create(item);

        assertEquals("Apple", saved.getName());
        verify(repository, times(1)).save(item);
    }

    @Test
    void testGetAll() {
        List<GroceryItem> list = Arrays.asList(
                new GroceryItem("Apple", 5, 1.5),
                new GroceryItem("Banana", 3, 2.0));
        when(repository.findAll()).thenReturn(list);

        List<GroceryItem> all = service.getAll();
        assertEquals(2, all.size());
    }

    @Test
    void testGetByIdFound() {
        GroceryItem item = new GroceryItem("Apple", 5, 1.5);
        when(repository.findById(1L)).thenReturn(Optional.of(item));

        Optional<GroceryItem> result = service.getById(1L);
        assertTrue(result.isPresent());
        assertEquals("Apple", result.get().getName());
    }

    @Test
    void testUpdateSuccess() {
        GroceryItem existing = new GroceryItem("Apple", 5, 1.5);
        GroceryItem update = new GroceryItem("Grapes", 10, 3.0);

        when(repository.findById(1L)).thenReturn(Optional.of(existing));
        when(repository.save(any(GroceryItem.class))).thenReturn(update);

        GroceryItem result = service.update(1L, update);
        assertEquals("Grapes", result.getName());
        assertEquals(10, result.getQuantity());
        assertEquals(3.0, result.getPrice());
    }

    @Test
    void testUpdateNotFound() {
        GroceryItem update = new GroceryItem("Grapes", 10, 3.0);
        when(repository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> service.update(1L, update));
    }

    @Test
    void testDelete() {
        service.delete(1L);
        verify(repository, times(1)).deleteById(1L);
    }
}
