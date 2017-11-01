package ru.vb.Program1;
import java.util.Scanner;
/**
 * Created by user on 28.10.2017.
 */
public class Program03 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter n=");
        int n=a.nextInt();
        int x=n+2-n%2;

        System.out.println("After n goes="+x);
    }
}
