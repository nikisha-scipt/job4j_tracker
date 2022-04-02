package ru.job4j.search;

import java.util.LinkedList;

/**
 * This class describe work the simplest queue at priority which is working according to principle FIFO (first in - first out)
 * @author DANIL NIKISHIN
 * @version 1.0
 */

public class PriorityQueue {
    /**
     * Keeping a task is materializing in collection type LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *The method is receiving at input a request, and he is adding him in queue
     *If there are 2 tasks with the same priority, then they are distributed in the queue according to the FIFO principle.
     * @param task which has been added in queue
     */
    public void put(Task task) {
        var index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;

        }
        this.tasks.add(index, task);
    }

    /**
     * The method allows you to get the first task in the queue
     * @return returns the task from the head of the queue, or null if the queue is empty
     */
    public Task take() {
        return this.tasks.poll();
    }

}
