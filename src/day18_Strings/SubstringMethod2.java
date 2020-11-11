package day18_Strings;
import java.util.Scanner;
public class SubstringMethod2 {
    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789......

        String day = str.substring(9, str.length());

        System.out.println(day);

        System.out.println("=========================================================");




        String firstName = "cyBeRTek";   //Cybertek

        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("======================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName1 = scan.next();  // Cybertek
        firstName = firstName1.substring(0, 1).toUpperCase() + firstName1.substring(1).toLowerCase();

        System.out.println("Last Name: ");
        String lastName = scan.next();
        lastName = lastName.substring(0,1).toUpperCase() +  lastName.substring(1).toLowerCase();


        String fullName = firstName1+" "+lastName;
        System.out.println("Full Name: "+fullName);












    }
}
