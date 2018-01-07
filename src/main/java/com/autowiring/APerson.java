package com.autowiring;


public class APerson {

    private String name;

    public APerson() {
    }

    public APerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "APerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
