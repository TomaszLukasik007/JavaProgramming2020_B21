package day21_WhileLoop;
import java.util.Scanner;
public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();  // "Java"

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f + l);

        String r1 = "Batch" + 2 + 1;

        System.out.println("===========================================");

        while(true) {

        System.out.println("Enter building number: ");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter street name: ");
        String street = scan.next();

        System.out.println("Enter apartment number: ");
        String apartment = scan.next();

        scan.nextLine();

        System.out.println("Enter the city: ");
        String city = scan.next();

        System.out.println("Enter the state: ");
        String state = scan.next();

        System.out.println("Enter zipCode: ");
        int zipCode = scan.nextInt();

        String fullAddress = building + " " + street + " " + apartment + "\n" + city + " " + state + " " + zipCode;

        System.out.println(fullAddress);

        System.out.println("Would you like to continue? Yes, No");

        String answer = scan.next();

        if (answer.equalsIgnoreCase("no")) {
            break;
        }
    }
  }
}