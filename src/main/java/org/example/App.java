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
        String xyz = "XXX";
        String bcd = "Hello There !";

        Distributor dm = new Distributor(xyz);
        ItemMaster im = new ItemMaster(xyz);


        Distributor dm = new Distributor(abc);
        ItemMaster im = new ItemMaster(bcd);

    }
}
