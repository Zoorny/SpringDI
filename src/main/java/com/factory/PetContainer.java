package com.factory;

public class PetContainer {

    public Pet getPet(){
        return new Cat();
    }
}
