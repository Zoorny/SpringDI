package com.netcracker;

import org.springframework.context.annotation.Bean;

public class Box {

    private Toy toy;

    public Box(Toy toy){
        this.toy = toy;
        System.out.println("Box.Box");
    }

    public void useToy(){
        toy.play();
    }
}
