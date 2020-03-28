package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RandomTask a = new RandomTask("hello");
        a.execute();

        RadomOutTask b=new RadomOutTask();
        b.execute();

        CounterOutTask c=new CounterOutTask();
        c.execute();

    }
}
