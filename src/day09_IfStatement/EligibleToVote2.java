package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {

        String name = "Daniel";
        boolean isUSACitizen = true;
        int age= 38;

        boolean isEligible1 = isUSACitizen == true && age >= 18;
                   //                 true        &&    true
                      //                          true
        System.out.println(name+" is eligible to vote: "+isEligible1);

        System.out.println("============================================");

        String name1 = "Jimmy";
        boolean isUSCitizen = false;
        int age1 = 25;
        boolean hasCriminalBackground = false;

        boolean isEligible =   isUSCitizen == true  &&  age1 >= 18 && hasCriminalBackground == false ;
        //                    false == true  &&  25 >= 18  &&  false == false
        //                         false && true && true
        //                          false

        System.out.println(name1+" is eligible to vote: "+isEligible);

        String name2 = "John";
        String c1 = "China";
        String c2 = "Canada";

        boolean eligible =  c1 == "USA"   ||   c2 == "USA";
        //                 "China" == "USA" || "Canada" == "USA"
        //                      false || false
        //                      false



        System.out.println(name2+" is eligible to vote: "+eligible);












    }
}
