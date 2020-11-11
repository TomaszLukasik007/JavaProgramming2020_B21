package day21_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    /*
    2.  Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

     */

        System.out.println("Enter factorial number: ");
        double num = scan.nextDouble() ;

        int result = 1;   // 3*2 = 6*1 = 6

        //3: 3*2*1
        //4: 4*3*2*1
        //5: 5*4*3*2*1

        for(double i = num; i>=1; i--){
            result *= i;  // 3, 2, 1
}

        System.out.println("result = "+result);

    }
}