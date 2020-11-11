package day16_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age= input.nextInt();

        System.out.println("Enter your phone number");
        long phoneNum = input.nextLong();

        input.nextLine();

        System.out.println("Enter you full name");
        String fullName = input.nextLine();

        System.out.println("Name: "+fullName);
        System.out.println("AGE: "+age);
        System.out.println("Phone number: "+phoneNum);





    }
}
