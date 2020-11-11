package day03_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        //   \n:
        System.out.println("Hello everyone");
        System.out.println("My name is Tomasz, I am from Chicago");

        System.out.println("=====================================================");

        System.out.println("Hello everyone\nMy name is Tomasz, I am from Chicago");

        //   \t:
        System.out.println("\tToday I learn Java");
        System.out.println("it was so much fun");

        //   \\:

        System.out.println("/");  // prints single front slash
        System.out.println("\\"); // print  single backslash

        System.out.println("======================================================");
        //   \' or '
        System.out.println("My name is 'Muhtar'");
        System.out.println("My name is \'Muhtar\'");

        System.out.println("=======================================================");
        //   \"
        System.out.println("My favorite show is \"Game of thrones\"");
    }
}
