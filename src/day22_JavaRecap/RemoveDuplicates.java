package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBCC";   // A, A, A, B, B
        String result = "";     // "ABC"

        for(int i = 0; i <= str.length()-1; i++) {

            String eachCharacter = "" + str.charAt(i);     // A, A, A, B, B

            if (result.contains(eachCharacter)){ ;

                continue;

            }else{
                result += eachCharacter;

      /*            if(!result.contains(eachCharacter)) {

                      result += eachCharacter;      */


                //tenery

                      //    result += (!result.contains(eachCharacter)) ? eachCharacter : "";

            }
        }

        System.out.println("result = "+ result);

        System.out.println("========================================================");



















    }
}
