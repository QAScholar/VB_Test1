package ru.vb.Program1;
import java.util.Scanner;
import static java.lang.Math.PI;
//Задача 11.	Написать программу для определения диаметра окружности,
// которую можно получить из отрезка проволоки длиной Х (X задает пользователь с клавиатуры).
public class Program11 {
    public static void main(String[] args) {

        System.out.print("Введите длину отрезка проволки= ");
        Scanner a=new Scanner(System.in);
        double X=a.nextInt();
        //Если из отрезка проволки сделать окружность, то длина отрезка будет длиной окружности.
        //Из длины окружности находим диаметр (d) по формуле X=PI*d
        double d=X/PI;
        System.out.printf("Диаметр окружности полученной из отрезка проволки длиной "+ X+"= "+ "%.2f",d);
    }
}
