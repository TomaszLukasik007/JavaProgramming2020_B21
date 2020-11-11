package day04_Variables;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.sql.SQLOutput;

public class CalculateCircle {
    public static void main(String[] args) {
        /*
        Task03: CalculateCircle
     write a program that can calculate the area and perimeter of the circle based on the given radius
        Hints: Area of circle = r * r * PI
              Perimeter of circle = 2 * r * PI
               */

                double r = 7.5;
                double pi = 3.14;

                double area = r * r * pi;
                double perimeter = 2 * r * pi;

                System.out.println("Area is: ");
                System.out.println(area);
                System.out.println("Perimeter is: ");
                System.out.println(perimeter);














    }
}
