package day17_Strings;
import java.util.Scanner;
public class Scanner_Review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // make the scanner object

        System.out.println("Pick a number from 1 to 10");
        byte num = input.nextByte(); // accept one byte value

        if(num > 0&& num < 11) {
        }else {
            System.out.println("Invalid number");
        }
        System.out.println("Can you enter that number as a word");
            String word = input.next();  // accept one word

            System.out.println("Number: " + num);
            System.out.println("Word: " + word);


        }

    }

