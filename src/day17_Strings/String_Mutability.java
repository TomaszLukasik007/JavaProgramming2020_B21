package day17_Strings;

public class String_Mutability {
    public static void main(String[] args) {

        String wordOne = "Friday";      //friday==>monday
        String wordTwo = wordOne;       //friday
        String wordThree = "Friday";    //friday

        wordOne = "Monday";




        System.out.println(wordTwo);
        System.out.println(wordOne);
        System.out.println(wordOne == wordThree);  //monday and friday false




    }
}
