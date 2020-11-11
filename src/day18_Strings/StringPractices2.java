package day18_Strings;
import java.util.Scanner;
public class StringPractices2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
    MacBook:
        air: 2400
        pro: 2500
    Iphone:
        12: 1000
        11: 900
        10: 800
        8: 700
    Ipad:
        air: 500
        mini: 400
        pro: 300
 */

        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();
        product = product.replace(" ", "").toLowerCase();

        switch (product) {
            case "macbook":

            System.out.println("Which model MacBook would you like? ");
            String model = scan.nextLine();

            if (model.equalsIgnoreCase("Air")){
                System.out.println("MacBook Air is $2400");

            }else if (model.equalsIgnoreCase("Pro")){
            System.out.println("MacBook Pro is $2500");
            }else {
                System.out.println("Invalid Model for MacBook");

            }
                break;
                case "iphone":

                System.out.println("Which model Iphone would you like? ");
                String model2 = scan.nextLine();

                if (model2.equalsIgnoreCase("12")) {
                    System.out.println("Iphone 12 is $1000");

                } else if (model2.equalsIgnoreCase("11")) {
                    System.out.println("Iphone 11 is $900");
                } else if (model2.equalsIgnoreCase("10")) {
                    System.out.println("Iphone 10 is $800");
                } else if (model2.equalsIgnoreCase("8")) {
                    System.out.println("Iphone 8 is $700");
                } else {
                    System.out.println("Invalid Model for Iphone");
                    break;
                }
                    case "ipad":

                    System.out.println("Which model Ipad would you like? ");
                    String model3 = scan.nextLine();

                    if (model3.equalsIgnoreCase("Air")) {
                        System.out.println("Ipad Air is $500");

                    } else if (model3.equalsIgnoreCase("Mini")) {
                        System.out.println("Ipad Mini is $400");
                    } else if (model3.equalsIgnoreCase("Pro")) {
                        System.out.println("Ipad Pro is $300");
                    } else {
                        System.out.println("Invalid Model for Ipad");
                    }
                        break;


                        default:
                        System.out.println("Invalid product name");

                }}}
