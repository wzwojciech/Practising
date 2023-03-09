package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Manager {

    ArrayList<String> tasks;

    public Manager() {
        tasks = new ArrayList<>();
    }

    public void performTasks(ArrayDeque<String> queue) {
        while (queue.size() > 0) {
            String task = queue.poll();
            System.out.println("Processing task: " + task);
            tasks.add(task);
        }
        System.out.println("Performed tasks: " + tasks.size());
    }


    @Override
    public String toString() {
        return "Manager{" +
                "tasks=" + tasks +
                '}';
    }
}



