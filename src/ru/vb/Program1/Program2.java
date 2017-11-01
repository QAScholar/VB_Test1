package ru.vb.Program1;
import java.util.Scanner;
/**
 * Created by user on 28.10.2017.
 * Задача 2.	С клавиатуры вводится двузначное натуральное число. Вывести на экран количество десятков в нем.
 */
public class Program2 {
    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        //Попытка ограничить ввод чисел только до двузначных
        if (x<10)
        {
            System.out.println("Слишком маденькое число. Введите двузначное натуральное число");
        }
        else if (x>99)
        {
            System.out.println("Слишком большое число. Введите двузначное натуральное число");
        }
        else
        {
            //Получение десятков
            int y = x / 10;
            System.out.println(y);
        }
    }
}
