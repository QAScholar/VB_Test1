package ru.vb.Shapes;

/**
 * Created by user on 09.11.2017.
 */
public class Rectangle  {
    int a,b,x,y;
    String color;

    public static void main(String[] args) {
        Rectangle rect1=new Rectangle();
    }



    public Rectangle (){};

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
        this.color=color;

    }
}
