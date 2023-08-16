package com.nhnacademy.java.waitinglist;

import java.time.*;

public class Desk implements Runnable {
    private String deskName;
    private int processingTime;
    private WaitingList list;

    public Desk(String deskName, int processingTime, WaitingList list) {
        this.deskName = deskName;
        this.processingTime = processingTime;
        this.list = list;
    }

    public void getCustomer() {
        try {
            System.out.println(this.getDeskName() + " is waiting for customer");
            Thread.sleep(500);
            if (list.count() > 0) {
                System.out.println(this.getDeskName() + ": " + this.list.count() + " customer is waiting");

                    Customer customer = this.list.startService();
                    System.out.println(this.deskName + " starting service to customer No " + customer.getWaitingNumber());

                    Thread.sleep(processingTime);
                    System.out.println(this.deskName + " finish server of customer No " + customer.getWaitingNumber());
                    customer.setServiceStartTime(LocalTime.now());
                    System.out.println(this.deskName + " waiting for service...");
            }
        }
        catch (Exception e) {}
    }

    public void startService() {
        while(true) {
            this.getCustomer();
        }
    }

    public void run() {
        for(;;) {
            this.startService();
        }
    }

    public String getDeskName() {
        return this.deskName;
    }
}
