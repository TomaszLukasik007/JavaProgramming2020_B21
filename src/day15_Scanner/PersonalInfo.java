package day15_Scanner;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        byte age = info.nextByte();

        System.out.println("Please enter your favorite number: ");
        long favNum = info.nextLong();

        System.out.println("Are you a student? Enter true or false ");
        boolean isStudent= info.nextBoolean();

        System.out.println("Age: "+age);
        System.out.println("Favorite number : "+favNum);
        if(isStudent) {
            System.out.println("Great, you are the student!");
        }else{
            System.out.println("Oh okey, you are not the student");
        }
    }
}
