package com.pruebatecnica.controller;

import com.pruebatecnica.domain.Response;
import com.pruebatecnica.exception.CustomException;
import com.pruebatecnica.models.Task;
import com.pruebatecnica.service.ITaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pruebatecnica.util.GeneralUtils.builderResponse;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TaskController {

    private final ITaskService taskService;

    // Obtener todas las tareas
    @GetMapping
    public Response<Object> getAllTasks() {
        List<Task> tasks = taskService.findAll();
        return builderResponse("consulta exitosa","consulta exitosa",200,tasks);
    }

    // Obtener una tarea por ID
    @GetMapping("/{id}")
    public Response<Object> getTaskById(@PathVariable Long id) throws CustomException {
        Task task = taskService.findById(id);
        return builderResponse("consulta exitosa","consulta exitosa",200,task);
    }

    // Crear una nueva tarea
    @PostMapping
    public Response<Object> createTask(@RequestBody Task task) {
        Task newTask = taskService.save(task);
        return builderResponse("consulta exitosa","consulta exitosa",200,newTask);    }

    // Actualizar una tarea existente
    @PutMapping("/{id}")
    public Response<Object> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) throws CustomException {
        Task updatedTask = taskService.update(id, taskDetails);
        return builderResponse("consulta exitosa","consulta exitosa",200,updatedTask);    }

    // Eliminar una tarea por ID
    @DeleteMapping("/{id}")
    public Response<Object> deleteTask(@PathVariable Long id) throws CustomException {
        taskService.delete(id);
        return builderResponse("consulta exitosa","consulta exitosa",200,"");    }
}
