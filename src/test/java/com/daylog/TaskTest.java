package com.daylog;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TaskTest {

    private Task task;

    @BeforeAll
    void setUp() {
        final String description = "Read through the API docs of x vendor";
        final String name = "Research API docs";
        final TaskType type = TaskType.RESEARCH;
        this.task = new Task(name, description, type);
    }

    @Test
    void getTaskNameTest() {
        assertEquals(this.task.getName(), "Research API docs");
    }

    @Test
    void getTaskDescriptionTest() {
        assertEquals(this.task.getDescription(), "Read through the API docs of x vendor");
    }

    @Test
    void getTaskTypeTest() {
        assertEquals(this.task.getType(), "RESEARCH");
    }

    @AfterAll
    void tearDown() {
    }
}
