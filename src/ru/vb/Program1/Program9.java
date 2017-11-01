package ru.vb.Program1;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        System.out.print("Введите величину километров= ");
        //Вводим километры
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();
        //Считаем  сухопутные мили
        double y=x*1.609;
       //Считаем  морские мили
        double z=x*1.852;
        //Выводим те и другие мили
        System.out.println(x+" километров- это " +y+" сухопутных и " +z+" морских  миль");


    }
}
