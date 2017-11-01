package ru.vb.Program1;
import java.util.Scanner;
// Задача 10.	Написать программу, которая находит процент P от суммы S.
public class Program10 {
    public static void main(String[] args) {

        System.out.print("Введите сумму= ");
        Scanner a=new Scanner(System.in);
        double S=a.nextInt();

        System.out.print("Введите процент=  ");
        Scanner b=new Scanner(System.in);
        double P=b.nextInt();

        double z= (S*P)/100;
        System.out.println("Процент P  "+P+"от суммы S "+S+"= "+z);
    }
}
