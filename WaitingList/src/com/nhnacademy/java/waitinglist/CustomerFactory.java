package com.nhnacademy.java.waitinglist;

public class CustomerFactory implements Runnable {
    int customerWaitingNumber = 1;
    WaitingList list;

    public CustomerFactory(WaitingList list) {
        this.list = list;
    }

    public void createCustomer() {
        try {
            this.list.startWaiting(new Customer(this.customerWaitingNumber));
            System.out.println("Customer count:" + this.list.count());
            this.customerWaitingNumber++;
            Thread.sleep(500);
        }
        catch (Exception e) {}
    }

    public void run() {
        for (;;)
            this.createCustomer();
    }
}
