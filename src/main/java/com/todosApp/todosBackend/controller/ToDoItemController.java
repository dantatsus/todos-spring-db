package com.todosApp.todosBackend.controller;

import com.todosApp.todosBackend.entity.ToDoItem;
import com.todosApp.todosBackend.service.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todo")
@CrossOrigin(origins = "http://localhost:3000")
public class ToDoItemController {
    @Autowired
    private ToDoItemService service;

    @GetMapping
    public List<ToDoItem> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<ToDoItem> getItemById(@PathVariable Long id) {
        return service.getItemById(id);
    }

    @PostMapping
    public ToDoItem addItem(@RequestBody ToDoItem item) {
        return service.addItem(item);
    }

    @PutMapping("/{id}")
    public ToDoItem updateItem(@PathVariable Long id, @RequestBody ToDoItem item) {
        item.setId(id); // Ensure the item ID is set
        return service.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }
}
