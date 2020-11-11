package day12_NestedIf;

import java.sql.SQLOutput;

public class task1 {
    public static void main(String[] args) {

/*   1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
            Note: MUST USE NESTED IF
    2. write a program that can find the number of days in a month
            Note: MUST USE NESTED IF
    3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
    4. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name           */

        int number = 5;
        String name = "";

        if (number >= 0 && number <= 9) {
            name = (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three" : (number == 4) ? "Four"
                    : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine";
            System.out.println(name);
        } else {
            System.out.println("Invalid");
        }


        System.out.println("===================================================================================");

        int month = 4;
        String days = " ";

        if (month >= 0 && month <= 12) {
            days = (month == 1) ? "January has 31 Days" : (month == 2) ? "February has 29 Days" : (month == 3) ? "March has 31 Days"
                    : (month == 4) ? "April has 30 Days" : (month == 5) ? "May has 31 Days" : (month == 6) ? "June has 30 Days"
                    : (month == 7) ? "July has 31 Days" : (month == 8) ? "August has 31 Days" : (month == 9) ? "September has 30 Days"
                    : (month == 10) ? "October has 31 Days" : (month == 11) ? "November has 30 Days" : "December has 31 Days";

            System.out.println(days);
        }
        System.out.println("=====================================================================================================");

        int age = 151;
        String ageGroups = "";

        if (number >= 1 && number <= 150) {

            if (age < +21) {
                ageGroups = "Teenager";

            } else if (age >= 21 && age <= 55) {
                ageGroups = "Adult";

            } else {
                ageGroups = "Senior";
            }
            }else {
            ageGroups = "Invalid";
            }
            System.out.println(ageGroups);



    }
}