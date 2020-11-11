package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Scanner object called scanner

        System.out.println("Enter number one:");
        int num1 = scanner.nextInt();  // reading an int number

        System.out.println("Eneter number two:");
        int num2 = scanner.nextInt();  // reading an int number

        System.out.println("Number one: "+num1);
        System.out.println("Number one: "+num2);
        System.out.println("Sum: "+ (num1+num2));




    }
}

