package ru.vb.Program1;
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {

        System.out.print("Введите величину градусов Цельсия= ");
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();
        double y=x*1.8+32;
        double z=x+273.15;
        double b=x*0.8;
        double c=(100-x)*3/2;
        System.out.println(x+" градусов Цельсия= "+y+ " градусов Фаренгейта, "+z+" градусов Кельвина, "+ b + " градусов Реомюра, "+c+ " градусов Делиля");

        //Вторая часть задачи- осуществляется через нажатие клавиши
        System.out.println();
        System.out.print("Чтобы реализовать перевод из градусов по Фаренгейту в градусы по Цельсию, нажмите любую клавишу");
        Scanner key = new Scanner(System.in);
        key.nextLine();

        System.out.print("Введите величину градусов по Фаренгейту =");
        Scanner s = new Scanner(System.in);
        double f=s.nextInt();
        double C=(f-32)/1.8;
        System.out.print(f+ " градусов Фаренгейта= "+C+" градусов Цельсия");
    }
}
