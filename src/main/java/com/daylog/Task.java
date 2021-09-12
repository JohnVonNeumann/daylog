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
        throw new NotYetImplementedException();
    }

    public String getDescription() {
        throw new NotYetImplementedException();
    }

    public String getType() {
        throw new NotYetImplementedException();
    }
}