package com.example.task_manager_backend;

import org.springframework.data.jpa.repository.JpaRepository; // Spring Data JPA interface

// This interface extends JpaRepository, automatically providing CRUD operations for Task entities
// <Task, Long> means it manages Task objects and their primary key (ID) is of type Long
public interface TaskRepository extends JpaRepository<Task, Long> {
}
