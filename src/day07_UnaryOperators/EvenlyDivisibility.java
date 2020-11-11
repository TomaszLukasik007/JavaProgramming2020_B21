package day07_UnaryOperators;

public class EvenlyDivisibility {

    public static void main(String[] args) {

/*Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true */

              int number = 65;
              int remainderOf2 = number % 2;
              int remainderOf3 = number % 3;
              int remainderOf5 = number % 5;

              boolean divisibleOf2 = remainderOf2 < 1;
              boolean divisibleOf3 = remainderOf3 < 1;
              boolean divisibleOf5 = remainderOf5 < 1;

              System.out.println(number+" is divivisible by 2: "+divisibleOf2);
              System.out.println(number+" is divivisible by 2: "+divisibleOf3);
              System.out.println(number+" is divivisible by 2: "+divisibleOf5);













    }
}
