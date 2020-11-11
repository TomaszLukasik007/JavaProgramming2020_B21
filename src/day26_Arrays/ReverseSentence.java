package day26_Arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
   //     Scanner scan = new Scanner(System.in);

                   String sentence = "Today is Monday";
                   String[] words = sentence.split(" ");

                   System.out.println( Arrays.toString(words));

                   String reversedSnetence = "";

                   for(int i = words.length-1; i >=0 ; i-- ){
                       reversedSnetence += (words[i] +" ");
                   }

                      reversedSnetence = reversedSnetence.trim();
                      System.out.println(reversedSnetence);





    }
}
