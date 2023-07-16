package org.example;

public class App 
{
    public static void main( String[] args )
    {
        for(int i=0;i<=2;i++)
            System.out.println("for loop");
        System.out.println( "Rahul" );
        System.out.println( "Amit Malvi" );
        System.out.println( "Preeti Malvi" );

        String abc = "Hello There !";

        Distributor dm = new Distributor("commiting changes on local server ");
        ItemMaster im = new ItemMaster("commiting changes here in local");

    }
}
