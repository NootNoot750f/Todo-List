package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAddTask() {
        System.out.println("Running testAddTask...");
        TaskList list = new TaskList();
        list.addTask("Test Task");
        assertEquals(1, list.getAllTasks().size());
        System.out.println("testAddTask passed!");
    }

    @Test
    void testCompleteTask() {
        System.out.println("Running testCompleteTask...");
        TaskList list = new TaskList();
        list.addTask("Test Task");
        list.completeTask("Test Task");
        assertTrue(list.getAllTasks().get(0).isComplete());
        System.out.println("testCompleteTask passed!");
    }

    @Test
    void testClearAll() {
        System.out.println("Running testClearAll...");
        TaskList list = new TaskList();
        list.addTask("Task 1");
        list.addTask("Task 2");
        list.clearAll();
        assertEquals(0, list.getAllTasks().size());
        System.out.println("testClearAll passed!");
    }
}
