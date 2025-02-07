package com.pruebatecnica.service;

import com.pruebatecnica.exception.CustomException;
import com.pruebatecnica.models.Task;

import java.util.List;

public interface ITaskService {
    List<Task> findAll();
    Task findById(Long id) throws CustomException;
    Task save(Task task);
    Task update(Long id, Task taskDetails) throws CustomException;
    void delete(Long id) throws CustomException;
}
