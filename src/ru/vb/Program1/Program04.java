package ru.vb.Program1;
import java.util.Scanner;
/**
 * Created by user on 28.10.2017.
 */
public class Program04 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter n=");
        int n=a.nextInt();
        System.out.print("Enter b=");
        int b=a.nextInt();
        System.out.print("Enter c=");
        int c=a.nextInt();
        int d=(b+b+c)/3;
        System.out.println("Среднее арифметическое чисел "+n+","+b+" и "+c+"= "+d);
    }
}