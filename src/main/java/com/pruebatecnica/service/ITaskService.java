package com.pruebatecnica.service;

import com.pruebatecnica.models.Task;

import java.util.List;

public interface ITaskService {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    Task update(Long id, Task taskDetails);
    void delete(Long id);
}
