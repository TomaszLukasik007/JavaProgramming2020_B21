package day18_Strings;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 /*
    ask the user to enter first and last names, then print out the full name
            input:
                cYbErTeK
                sCHOOL
            output:
                Cybertek School
     */


        System.out.println("Enter your first name");
        String f = input.nextLine();
        f = f.substring(0,1).toUpperCase() + f.substring(1, f.length()-1+1).toLowerCase();



        System.out.println("Enter your last name");
        String l = input.nextLine();
        l = l.substring(0,1).toUpperCase() + l.substring(1, l.length()).toLowerCase(); // to samo

        System.out.println("First name is: "+f);
        System.out.println("Last name is: "+l);

        String fullname = f+" "+l;
        System.out.println("Full name is: "+fullname);













    }
}
