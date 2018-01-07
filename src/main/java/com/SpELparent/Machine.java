package com.SpELparent;

public class Machine {

    private String prop;

    public Machine() {
    }

    public Machine(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String doStuff(){
        return prop + '1';
    }

    @Override
    public String toString() {
        return "Machine{" +
                "prop='" + prop + '\'' +
                '}';
    }
}
