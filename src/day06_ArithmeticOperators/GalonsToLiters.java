package day06_ArithmeticOperators;

public class GalonsToLiters {

    public static void main(String[] args) {

                double gallon = 120.5;
                double liters = gallon * 3.78541;
        System.out.println(gallon+" gallons equal to " +liters+" L.");
        System.out.println("==================================================================");

        boolean exceeded300Liters = liters > 300;  // the litters exceeds 300
        System.out.println( gallon+ " gallons exceeds 300 liters: " + exceeded300Liters);

    }
}
/*         Ex:
        galon = 10;
        output:
        10 gallons equal to 37.8541 liters
                galon = 20
        output:
        20 gallons equal to 75.7082 liters
        Hint: 1 gallon = 3.78541 liters
        Task03:
        create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result */