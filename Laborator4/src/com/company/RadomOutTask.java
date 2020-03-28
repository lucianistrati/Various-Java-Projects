package com.company;

import java.lang.Math;

public class RadomOutTask implements Task {

    private final double val = Math.random();

    /*public RandomOutTask(){
        this.val = Math.random();
    }*/
    @Override
    public void execute(){
        System.out.println(this.val);
    }
}
