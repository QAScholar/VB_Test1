package ru.vb.Program1;
import java.util.Scanner;
/**
 * Created by user on 28.10.2017.
 */
public class Program06 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число=");
        int x=a.nextInt();
        System.out.print("Введите степень=");
        int y=a.nextInt();

        System.out.print("Число "+x+" в степени "+y+"= "+Math.pow(x,y));
    }
}
