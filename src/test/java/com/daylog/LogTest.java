package com.daylog;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LogTest {

    private Log log;

    @BeforeAll
    void setUp() {
        this.log = new Log();
    }

    @Test
    void LogTest() {
        assertTrue(true);
    }

    @AfterAll
    void tearDown() {
    }
}