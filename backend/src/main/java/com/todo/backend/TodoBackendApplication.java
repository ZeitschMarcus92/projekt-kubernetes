package com.todo.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class TodoBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoBackendApplication.class, args);
    }
}

@RestController
@RequestMapping("/")
class TodoController {

    private final Logger logger = Logger.getLogger(TodoController.class.getName());
    private final List<String> tasks = new ArrayList<>();

    @GetMapping
    public String home() {
        return "🚀 ToDo Backend is running. Available endpoints: /tasks, /add-task";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping("/add-task")
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        logger.info("New task added: " + task);
        return "Task added successfully";
    }

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return tasks;
    }
}
