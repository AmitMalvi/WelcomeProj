package org.example;

public class Distributor {

    Distributor(){
        System.out.println("printing from Distributor.class");
    }

    Distributor(String s)
    {
        System.out.println("Distributor.class paramenterizd construto :: " +s);
    }

    Distributor(Integer i)
    {
        System.out.println("Distributor.class paramenterizd construto :: " +i);
    }
    Distributor(Integer i,String str)
    {
        System.out.println("Distributor.class paramenterizd construto :: " +i+" "+ str);
    }
}
