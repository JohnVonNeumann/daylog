package com.daylog;

import com.daylog.exceptions.NotYetImplementedException;

import java.time.LocalDateTime;

public class Task {
    Integer id;
    String name;
    String description;
    LocalDateTime dateTime;
    TaskType type;

    public Task(String name, String description, TaskType type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        throw new NotYetImplementedException();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getType() {
        return this.type.toString();
    }
}