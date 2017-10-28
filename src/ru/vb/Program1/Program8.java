package ru.vb.Program1;
import java.util.Scanner;
/**
 * Created by user on 28.10.2017.
 */
public class Program8 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter robles=");
        double n=a.nextInt();
        double d=n/58;
        double e=n/67;
        System.out.println(n+" roubles="+ d+" dollars and "+e+" euros");
    }
}
