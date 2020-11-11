package day13_SwitchStatement;

public class Task_2 {
    public static void main(String[] args) {

        char letter = 'B';
        String nameofletter = "";

        switch (letter) {

            case 'A':
                nameofletter = "A";
                break;
            case 'B':
                nameofletter = "B";
                break;
            case 'C':
                nameofletter = "C";
                break;
            case 'D':
                nameofletter = "D";
                break;
            case 'E':
                nameofletter = "E";
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        System.out.println(nameofletter);
    }
}
