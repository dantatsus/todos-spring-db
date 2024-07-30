package com.todosApp.todosBackend.dao;
import com.todosApp.todosBackend.entity.ToDoItem;

import java.util.List;
import java.util.Optional;


public interface ToDoItemDAO {
    List<ToDoItem> getAllItems();
    Optional<ToDoItem> getItemById(Long id);
    ToDoItem addItem(ToDoItem item);
    void deleteItem(Long id);
    ToDoItem updateItem(ToDoItem item);
}
