package day15_Scanner;

import java.util.Scanner;
public class Scanner_Decimal {
    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);

        System.out.println("Enter a float number");
        float floatnumber = decimal.nextFloat();
        System.out.println("Number is "+floatnumber);

        System.out.println("Enter a double number");
        double doublenumber = decimal.nextFloat();
        System.out.println("Number is "+doublenumber);

        System.out.println(decimal.nextFloat() + decimal.nextDouble());


    }
}
