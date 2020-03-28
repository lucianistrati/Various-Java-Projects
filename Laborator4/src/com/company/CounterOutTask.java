package com.company;

public class CounterOutTask implements Task{
    private static Integer contor=0;
    @Override
    public void execute()
    {
        contor+=1;
        System.out.println(contor);
    }
}
