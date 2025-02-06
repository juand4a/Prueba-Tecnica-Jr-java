package com.pruebatecnica.service;

import com.pruebatecnica.models.Task;
import com.pruebatecnica.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService implements ITaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con ID: " + id));
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task update(Long id, Task taskDetails) {
        Task existingTask = findById(id);
        existingTask.setTitulo(taskDetails.getTitulo());
        existingTask.setDescripcion(taskDetails.getDescripcion());
        existingTask.setEstado(taskDetails.isEstado());
        return taskRepository.save(existingTask);
    }

    @Override
    public void delete(Long id) {
        Task existingTask = findById(id);
        taskRepository.delete(existingTask);
    }
}
