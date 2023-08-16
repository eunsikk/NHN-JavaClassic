package com.nhnacademy.java.waitinglist;

import java.time.LocalDate;
import java.time.LocalTime;

public class Customer {
    private int waitingNumber;
    private LocalDate date;
    private LocalTime waitingStartTime;
    private LocalTime serviceStartTime;

    public Customer(int waitingNumber) {
        this.waitingNumber = waitingNumber;
        this.date = LocalDate.now();
        this.waitingStartTime = LocalTime.now();
        System.out.println(waitingNumber + " Customer is into waiting list");
    }

    public int getWaitingNumber() {
        return this.waitingNumber;
    }

    public String WaitingStartTime() {
        return this.date.toString() + " " + this.waitingStartTime.toString();
    }

    public void setServiceStartTime(LocalTime time) {
        this.serviceStartTime = time;
    }

    public String ServiceStartTime() {
        return this.date.toString() + " " + this.serviceStartTime.toString();
    }
}