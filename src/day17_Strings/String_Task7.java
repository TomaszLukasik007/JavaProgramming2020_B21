package day17_Strings;
import java.util.Scanner;
public class String_Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* . write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'.
        In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them: If the word is less than 3 letters: "Word is too short"
     - If the word is too long: "Word is too long"  */

        System.out.println("Enter a three letter world");
        String word = input.next();    //cat

        System.out.println(word.charAt(1));

        if(word.length() == 3) {

            if (word.charAt(1) == 'a') {
                System.out.println("Cool Word");
            } else {
                System.out.println("Not a cool word");
            }

        }else{
            if(word.length() < 3) {
                System.out.println("Word is to short");
            }else
                System.out.println("Word is to long");


        }
    }

}
