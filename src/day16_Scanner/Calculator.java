package day16_Scanner;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one");
        double numberOne = input.nextDouble();

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();

        input.close();

        double result = 0;

        boolean isValid = true;

        switch(operator){
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "x":
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne % numberTwo;
                break;
            default:
                System.out.println(operator+"Invalid operator");
                isValid = false;
        }
        if(isValid) {
            System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);
        }
    }
}
