package day07_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {

            /* Ex:
                year = 2020
            output:
                2020 is leap year: true
                year = 2021
            output:
                2021 is leap year: false
                >, <
                2020 % 4  < 1
        Hint: if the number of year can be evenly divisible by 4, it's known as leap year */

                     int year = 2000;
                     boolean isLeapYear = year % 4 < 1;

                     System.out.println( year+" is leap year: "+isLeapYear);

















    }
}
