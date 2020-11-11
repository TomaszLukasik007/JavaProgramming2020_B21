package day06_ArithmeticOperators;

public class Currencies {
    public static void main(String[] args) {


             int dollar = 15000;

             double lira = dollar / 0.13;
             double euro = dollar / 1.16;
             double rubles = dollar * 78.22;
             double JYP = dollar / 0.09;
             double som = dollar * 80;
             double PLN = dollar * 3.6;



             System.out.println(dollar+" dollar equal to "+lira+" lira");
             System.out.println(dollar+" dollar equal to "+euro+" euro");
             System.out.println(dollar+" dollar equal to "+rubles+" rubles");
        System.out.println("=============================================================");

             String result = dollar+"$ equal to ";

             System.out.println(result+lira+" lira");
             System.out.println(result+euro+" euro");
             System.out.println(result+rubles+" rubles");
             System.out.println(result+JYP+" JYP");
             System.out.println(result+som+" som");
             System.out.println(result+PLN+" PLN");






    }
}
