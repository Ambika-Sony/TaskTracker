package com.example.task_manager_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Marks this class as a Spring service component

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired // Injects an instance of TaskRepository
    private TaskRepository taskRepository;

    // Retrieves all tasks from the database
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Retrieves a single task by its ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null); // Returns null if not found
    }

    // Creates a new task or updates an existing one if ID is present
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Updates an existing task given its ID and the new task data
    public Task updateTask(Long id, Task task) {
        Optional<Task> existingTaskOptional = taskRepository.findById(id);
         if (existingTaskOptional.isPresent()) {
            Task existingTask = existingTaskOptional.get();
            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setDueDate(task.getDueDate());
            existingTask.setCompleted(task.isCompleted());
            existingTask.setTags(task.getTags()); // Update tags as well
            return taskRepository.save(existingTask); // Save the updated existing task
        }
        return null; // Task not found
    }

    // Deletes a task by its ID
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}