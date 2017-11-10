package ru.vb.Shapes;

/**
 * Created by user on 10.11.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        //Рисуем прямоугольник
        Rectangle rectangle1=new Rectangle();
        rectangle1.a=10; rectangle1.b=20;
        rectangle1.draw();
        rectangle1.area();
        rectangle1.square();

        Rectangle rectangle2=new Rectangle(4,8);


        //Разграничиваем результаты
        System.out.println();

        //Рисуем круг
        Circle  circle1=new Circle();
        circle1.r=5;
        circle1.draw();
        circle1.square();

        //Разграничиваем результаты
        System.out.println();

        //Рисуем треугольник
        Triangle triangle1=new Triangle();
        triangle1.a=3;
        triangle1.b=5;
        triangle1.draw();
        triangle1.square();
    }
}
