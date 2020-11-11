package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your gender: ");
        String gender = scan.next();
        System.out.println("Your gender is: "+gender );

        System.out.println("What is your age: ");
        int age = scan.nextInt();
        System.out.println("Your gender name is: "+age);

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter your zip code: ");
        String zipcode = scan.next();
        System.out.println("Your zip code: "+zipcode);

        System.out.println("What is your Country name: ");
        String country = scan.next();
        System.out.println("Your gender is: "+country );

        System.out.println("What is your salary: ");
        double salary = scan.nextDouble();
        System.out.println("Your gender name is: "+salary);

        scan.nextLine();
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();
        System.out.println("Your full name is: "+companyName);

        System.out.println("Enter your address: ");
        String address = scan.nextLine();
        scan.close();
        System.out.println("Your full name is: "+address);




    }
}
