package com.todosApp.todosBackend.dao;

import com.todosApp.todosBackend.entity.ToDoItem;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ToDoItemDAOImpl implements ToDoItemDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ToDoItem> getAllItems() {
        return entityManager.createQuery("from ToDoItem", ToDoItem.class).getResultList();
    }

    @Override
    public Optional<ToDoItem> getItemById(Long id) {
        return Optional.ofNullable(entityManager.find(ToDoItem.class, id));
    }

    @Override
    public ToDoItem addItem(ToDoItem item) {
        entityManager.persist(item);
        return item;
    }

    @Override
    public void deleteItem(Long id) {
        ToDoItem item = entityManager.find(ToDoItem.class, id);
        if (item != null) {
            entityManager.remove(item);
        }
    }

    @Override
    public ToDoItem updateItem(ToDoItem item) {
        return entityManager.merge(item);
    }
}

