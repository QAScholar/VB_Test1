package ru.vb.Program1;

/**
 * Created by user on 26.10.2017.
 */
public class hellow
{public static void main( String args[] )
{
    System.out.println("Hello World!");
    System.out.println("My arguments:");
    for (int i = 0; i < args.length; i++)
    {
        System.out.println(" arg["+i+"] :"+args[i]);
    }
    System.out.println("Cya!");
}
}
