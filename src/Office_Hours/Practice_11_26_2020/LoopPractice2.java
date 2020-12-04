package Office_Hours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double hourlyRate = 0;
        int weeklyHour = 0;
        String answer =  "";

       do {


           System.out.println("Enter your hourly rate");
           hourlyRate = scan.nextDouble();

           System.out.println("How many hours do you work in a week?");
           weeklyHour = scan.nextInt();

           double salary = weeklyHour * hourlyRate * 52;
           System.out.println("Your Salary is " + salary);

           double tax = salary * 0.3;
           System.out.println("Your Tax is: " + tax);

           double salaryAfterTax = salary - tax;
           System.out.println("Your salary after tax is: " + salaryAfterTax);

           System.out.println("Would you like to continue?");
           answer = scan.next();

           while ( !(answer.equals("yes") || answer.equals("no")) ) {
               System.out.println("Would you like to continue?");
               answer = scan.next().toLowerCase();
               }
           }while(answer.equals("yes"));

       }
    }

