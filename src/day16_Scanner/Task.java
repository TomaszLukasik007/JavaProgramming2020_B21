package day16_Scanner;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("How many people you live with?");
        int numberOfPeople = input.nextInt();

        if (numberOfPeople > 0 && numberOfPeople <= 12) {

            if (numberOfPeople <= 2) {
                System.out.println("Live with less than 2 people");
            } else if (numberOfPeople < 7) {
                System.out.println("Live with 3-6 people");
            } else {
                System.out.println("Live with more than 6 people");
            }
        } else {
            System.out.println("Not a valid number of people");
        }
    }
}
