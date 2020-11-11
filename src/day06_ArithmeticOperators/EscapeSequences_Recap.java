package day06_ArithmeticOperators;

public class EscapeSequences_Recap {
    public static void main(String[] args) {
     /*

        \n: append new line
        \t: tab space, paragraph spce
        \\: \
        \": double quote



        Hello Everyone
        Hello Batch 21
        Today I have learn a programming language "Java"
        */

        System.out.println("Hello Everyone\nHello Batch 21\nToday I have learn a programming language \"Java\"");

        System.out.println("Hello Everyone\tHello Batch 21\tToday I have learn a programming language \"Java\"");

        System.out.println("Hello Everyone\\Hello Batch 21\\Today I have learn a programming language \"Java\"");

        System.out.println("Hello Everyone\"Hello Batch 21\"Today I have learn a programming language \"Java\"");

        System.out.println("============================================================================");
           /* My favorite quote is:
	            "YourfavoriteQuote"
				          - Name
		System.out.println("\\"); // da ci to \
				          */
        System.out.println("My favorite quote is: \n\t \"YourfavoriteQuote\"\n\t\t\t\t- \\Name");

     /*   My favorite quote is:
        "YourfavoriteQuote"
                - \Name

              */




    }
}
