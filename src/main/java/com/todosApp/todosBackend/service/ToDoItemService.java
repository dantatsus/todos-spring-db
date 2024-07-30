package com.todosApp.todosBackend.service;

import com.todosApp.todosBackend.dao.ToDoItemDAO;
import com.todosApp.todosBackend.entity.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoItemService {
    @Autowired
    private ToDoItemDAO toDoItemDAO;

    public List<ToDoItem> getAllItems() {
        return toDoItemDAO.getAllItems();
    }

    public Optional<ToDoItem> getItemById(Long id) {
        return toDoItemDAO.getItemById(id);
    }

    public ToDoItem addItem(ToDoItem item) {
        return toDoItemDAO.addItem(item);
    }

    public ToDoItem updateItem(ToDoItem item) {
        return toDoItemDAO.updateItem(item);
    }

    public void deleteItem(Long id) {
        toDoItemDAO.deleteItem(id);
    }
}
