package com.example.task_manager_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data; // Ensure Lombok extension is installed and working

@Entity // Marks this class as a JPA entity, mapped to a database table
@Data   // Lombok annotation: automatically generates getters, setters, toString, equals, hashCode
public class Task {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures auto-incrementing ID
    private Long id;
    private String title;
    private String description;
    private String dueDate;
    private boolean completed;
    private String[] tags; // For simplicity, storing tags as a String array (H2 supports this directly)
}
