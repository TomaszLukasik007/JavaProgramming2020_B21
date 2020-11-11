package day06_ArithmeticOperators;

import java.sql.SQLOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println( 10/4);   // 2
        System.out.println("10/4"); // text

        System.out.println(12 + 3.0);  // decimal(dziesietna) 15.0

        System.out.println("12" + 3);  // concatenation (laczenie) 123

        System.out.println( 'a' + 3 );  // addition (dodatek) 100
        //                   97 + 3

        System.out.println( 12.0 - 4 );  // 8.0 decimal

        double a = 12.0 / 3 ;  // 4.0 decimal
        System.out.println(a);

        int b = 10/3;
        System.out.println(b);  // 3 integer (liczba calkowita)

        double c = 10/3;       // 3.0 decimal
        System.out.println(c);

        double d = 10/3.0;
        System.out.println(d); // 3.333 decimal

        int x = 3/2;
        System.out.println(x); // 1 integer

        double y = 3/2;
        System.out.println(y); // 1.0 decimal

        double z = 3.0/2;
        System.out.println(z);

        System.out.println("======================================================");

        System.out.println(100%13); // reminder is 9 (glowna czesc)
        System.out.println(100%10); // reminder is 0
        System.out.println(20%4.5); //reminder  is 2.0





    }
}
