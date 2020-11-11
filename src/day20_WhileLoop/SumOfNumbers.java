package day20_WhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scan.nextInt();
        scan.close();
        int result = 0;

    for(int i=1; i<=num; i++) {
        result += i;
    }
        System.out.println("result: "+result);








    }
}
/*
    4. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050
                input: 50
                output: 1275        */