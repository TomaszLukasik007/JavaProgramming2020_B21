package day18_Strings;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789......

        String day = str.substring(9, 14+1);

        System.out.println(day);

        String email = "Vampirektransinc@gmail.com";
        //              123456789...............
        String domain = email.substring(17, 22);

        System.out.println(domain);

        System.out.println("============================================================");


        String s1 = "I like movies and books";

        String word1 = s1.substring(7, 12+1);  // or 13

        System.out.println(word1);

        System.out.println("=============================================================");

        String firstname = "tOmAsZ";   //Marwan

        String firstchar = firstname.substring(0,1).toUpperCase();
        String rest = firstname.substring(1, firstname.length()-1+1).toLowerCase();

        System.out.println(firstchar);
        System.out.println(rest);

        firstname = firstchar+rest;
        System.out.println(firstname);





    }
}
