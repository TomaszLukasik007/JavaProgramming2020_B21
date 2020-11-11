package day17_Strings;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner_review3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*  - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their  full name (String, single word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.    */

        System.out.println("Enter product name");
        String product = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt(); //we have to hit enter to submit the information

        input.nextLine();  // the enter from the above method will be absorbed

        System.out.println("Enter the full name");
        String fullname = input.nextLine();

        System.out.println(fullname+" your order for "+quantity+" "+product+" has been placed. Your total is "+(price*quantity));



    }
}
