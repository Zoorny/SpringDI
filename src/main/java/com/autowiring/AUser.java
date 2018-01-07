package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AUser {

    private APerson person;

    public AUser() {
    }
    @Autowired
    public AUser(APerson person) {
        this.person = person;
    }

    public APerson getPerson() {
        return person;
    }

    public void setPerson(APerson person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "AUser{" +
                "person=" + person +
                '}';
    }
}
