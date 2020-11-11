package day17_Strings;
import java.util.Scanner;
public class String_Memory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String strOne = "java";
        String strTwo = "java";
        String strThree = new String("java");
        String strFour = new String("java");



        System.out.println(strOne == strTwo);
        System.out.println(strOne == strThree);
        System.out.println(strThree == strFour);


        String strFive = "Java";

        System.out.println(strOne == strFive);


    }
}
