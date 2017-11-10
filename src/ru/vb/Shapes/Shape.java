package ru.vb.Shapes;
import static java.lang.Math.PI;
/**
 * Created by user on 09.11.2017.
 */
public class Shape {
    public int x,y;
    String Color;
     void draw(){};
     void area(){};
     void square(){};
}
   class Rectangle extends Shape {
    int a, b;
    void draw(){
        super.draw();
        System.out.println("Draw Rectangle with sides: "+ a+" and "+b);
}
    void area(){ int area1=2*a+2*b;
    System.out.println("Rectangle's area= "+area1);}

    void square(){int square1=a*b;
        System.out.println("Rectangle's square= "+ square1);}}

class Circle extends Shape {
    int r;
    void draw(){
        System.out.println("Draw Circle with radius= "+ r);
    }
    void square(){
        System.out.println("Circle's square= "+(PI*r*r));
    }
}



    /*public Rectangle (){};

    public Rectangle (int a, int b){};

    public Rectangle (int a, int b, int x, int y){};

    public int square(){
        return (this.a*this.b);
    }
    int area(){
        return (2*this.a+2*this.b);
    }
    String getColor(){
        return color;
    }
        void getColor(String color){
        this.color=color;*/



