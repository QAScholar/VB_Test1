package ru.vb.Program1;
import java.util.Scanner;

/* Задача 7.	Написать программу, которая  предлагает пользователю ввести радиус окружности,
 а затем считает площадь и длину этой окружности. Число Pi задать в программе как вещественную константу.
  */
public class Program7 {

    //Задаем константу Пи
    public static final double Pi=3.14;

    public static void main(String[] args) {

        //Вводим радиус
        System.out.print("Введите радиус окружности: ");
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();

        //Считаем площадь окружности
        double S=Pi*(Math.pow(x,2));
        System.out.println("Площадь окружности= "+ S);

        //Считаем длину окружности
        double L=Pi*2*x;
        System.out.println("Длина окружности= "+ L);
    }
}
