package com.netcracker;

public class Facility {

    private Worker worker;
    private String region;

    public void setWorker(Worker worker) {
        this.worker = worker;
        System.out.println("Facility.setWorker");
    }

    public Worker getWorker() {
        return worker;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
