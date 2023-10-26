package org.example.week3.labs.model;


import org.example.week3.labs.enums.taskStatus;

import static org.example.week3.labs.enums.taskStatus.COMPLETED;


public class TaskItem {
    private int taskId;
    private String taskDescription;
    private taskStatus taskStatus;

    public TaskItem(int taskId, String taskDescription, taskStatus COMPLETED) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }
        public int getTaskId() {
            return taskId;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public taskStatus getTaskStatus() {
            return taskStatus;
        }
}
