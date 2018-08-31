package com;

public class PriorityQueue {
    private Task[] heap;
    private int heapSize, capacity;

    PriorityQueue(int capacity) {
        this.capacity = capacity + 1;
        heap = new Task[this.capacity];
        heapSize = 0;
    }

    boolean isEmpty() {
        if (this.heapSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        heap = new Task[capacity];
        heapSize = 0;
    }

    boolean isFull() {
        if (heapSize == capacity-1) {
            return true;
        } else {
            return false;
        }
    }

    int size() {
        return heapSize;
    }

    void insert(String job, int priority){
        Task newJob = new Task(job, priority);
        heap[++heapSize] = newJob;
        int pos = heapSize;
        while(pos != 1 && newJob.priority > heap[pos/2].priority) {
            heap[pos] = heap[pos/2];
            pos /= 2;
        }
        heap[pos] = newJob;
    }
}
