package org.example;
import java.util.ArrayList;
import java.util.List;


public class TaskList {
    //private arrayList<Task>
    //public createNewTask(description,...)
    //public printAll()
    public TaskList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("Added Task: " + description);
    }

    public void completeTask(String description){
        for(Task task : tasks){
            if(task.getDescription().equalsIgnoreCase(description) && !task.isComplete()){
                task.markAsComplete();
                System.out.println("Completed Task: " + description);
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }

    public void printAll(){
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
            return; // Stop execution
        }
        System.out.println("All Tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void printCompleted() {
        System.out.println("Completed Tasks:");
        for (Task task : tasks) {
            if (task.isComplete()) {
                System.out.println(task);
            }
        }
    }

    public void printIncomplete() {
        System.out.println("Incomplete Tasks:");
        for (Task task : tasks) {
            if (!task.isComplete()) {
                System.out.println(task);
            }
        }
    }

    public void clearAll() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    private List<Task> tasks;



}