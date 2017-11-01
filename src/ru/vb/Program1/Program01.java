package ru.vb.Program1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by user on 26.10.2017.
 */
public class Program01 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);


        int x=in.nextInt();
        int y=x%10;
        System.out.println(y);
    }
}
