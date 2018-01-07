package com.SpELparent;

public class ExtendedMachine {
    private String prop;
    private String name;

    public ExtendedMachine() {
    }

    public ExtendedMachine(String prop, String name) {
        this.prop = prop;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String doStuff(){
        return prop + '2';
    }

    @Override
    public String toString() {
        return "ExtendedMachine{" +
                "prop='" + prop + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
