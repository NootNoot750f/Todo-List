package org.example;

public class Task {
    //Complete vs incomplete
    //Descrription
    //id
    //markascomplete()

   
    public Task(String description){
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription(){
        return description;
    }

    public boolean isComplete(){
        return isComplete; 
    }

    public void markAsComplete(){
        this.isComplete = true;
    }

    public String toString(){
        return(isComplete ? "[X] " : "[ ] ") + description;
    } 
    
    private String description;
    private boolean isComplete;

}
