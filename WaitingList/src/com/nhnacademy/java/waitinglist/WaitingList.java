package com.nhnacademy.java.waitinglist;

import java.util.Queue;
import java.util.LinkedList;

public class WaitingList {
    Queue<Customer> waitingList;

    public WaitingList() {
        this.waitingList = new LinkedList<Customer>();
    }

    public void startWaiting(Customer customer) {
        this.waitingList.offer(customer);
    }

    public Customer startService() {
        return this.waitingList.poll();
    }

    public int count() {
        return this.waitingList.size();
    }
}
