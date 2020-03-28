package com.company;

public class RandomTask implements Task{
    private final String mesaj;

    public RandomTask(String mesaj){
        this.mesaj = mesaj;
        }
    @Override
    public void execute(){
        System.out.println(this.mesaj);
    }
    /*
    public static void main(String[] args){
        RandomTask a = new RandomTask("hello");
        a.execute();
        }*/
}
