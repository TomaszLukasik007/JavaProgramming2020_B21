package day04_Variables;

import java.sql.SQLOutput;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        Task04: SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax = 0.28
                   salary after tax = 72000     */

              int salary = 10000;
              double tax = 0.28;

              double totalTax = salary * tax;
              double salaryAfterTax = salary - totalTax;

                System.out.println("Total Tax is: ");
                System.out.println(totalTax);
                System.out.println("Salary after Tax is: ");
                System.out.println(salaryAfterTax);
















    }
}
