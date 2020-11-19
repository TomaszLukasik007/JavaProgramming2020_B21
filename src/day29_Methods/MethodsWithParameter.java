package day29_Methods;

public class MethodsWithParameter {
    public static void main(String[] args) {


      int age = 35;

      eligibleToBuyAlcohol(age);

      calculateAge(1953,2020);

      calculateAge(1981,2020);

      calculateAge(1985,2020);

      calculateAge(2017,2020);


    }


     public static void eligibleToBuyAlcohol(int age){
        if(age >= 21){
            System.out.println("Eligible to buy Alcohol");
        }else{
            System.out.println("Not Eligible to buy Alcohol");
        }
    }

     public static void calculateAge(int birthYear, int currentYear){


         System.out.println("Your Age is: "+(currentYear-birthYear) );
     }
}

