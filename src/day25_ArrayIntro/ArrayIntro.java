package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

    //    String names = "Cybertek", "Muhtar";         ------->compiler error


        /*         String name1 = "Cyberterk";
                   String name2 = "Muhtar";
                   String name3 = "Inna";
                   String name4 = "Azad";
                   String name5 = "Erjon";                         */


                   String[] names = {"Cybertek", "Muhtar", "Inna", "Azad", "Erjon"};
                   // index num:          0          1        2       3       4

                   // retreive data from array:

                   System.out.println( names[2] );
                   System.out.println( names[1] );

                   String str1 = names[0];
                   System.out.println( str1 );

                   int[] score = {80, 85, 90, 70, 75, 77, 87, 97, 88};
                   // index:      0    1   2   3   4

                   // Erjon : 70

                   System.out.println( names[3] +" : "+ score[3]);
        System.out.println("====================================================");

     /*            System.out.println( names[0] +" : "+ score[0]);
                   System.out.println( names[1] +" : "+ score[1]);
                   System.out.println( names[2] +" : "+ score[2]);
                   System.out.println( names[3] +" : "+ score[3]);
                   System.out.println( names[4] +" : "+ score[4]);          */

    //           for(int i = 0; i <= 4; i++){     // i: 0, 1, 2, 3, 4
     //               System.out.println(names[i]+" : "+ score[i]);
      //          }



                    // i<5   is same with i <= 5-1
                 for(int i = 0; i < 5; i++){     // i: 0, 1, 2, 3, 4
                   System.out.println(names[i]+" : "+ score[i]);
        }






    }
}
