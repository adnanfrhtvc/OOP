package org.example.week3.labs.ds;

import org.example.week3.labs.enums.taskStatus;
import org.example.week3.labs.model.TaskItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github2", taskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", taskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", taskStatus.COMPLETED));
    }
}