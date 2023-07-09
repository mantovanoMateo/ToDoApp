package com.example.todoapp.persistence.entity;


import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private Boolean finished;
    private TaskStatus taskStatus;

}
