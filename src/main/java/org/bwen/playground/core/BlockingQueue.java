package org.bwen.playground.core;

import java.util.LinkedList;

public class BlockingQueue <E> {
    private LinkedList<E> queue = new LinkedList<>();
    private int limit = 10;

    public synchronized void put(E item) {
        while(queue.size() == limit) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

        if(queue.size()==0)
            notifyAll();
        queue.add(item);
    }

    public synchronized E get() {

        while(queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }

        if(queue.size() == limit)
            notifyAll();

        return queue.remove();
    }
}
