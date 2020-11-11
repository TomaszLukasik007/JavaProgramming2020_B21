package Office_Hours.Practice_11_11_2020;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int [] scores = new int[5];

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("===========================================");
        //         i <= scores.length-1 or i <= 4  or  i < 5
    for(int i = 0; i < scores.length; i++){
        System.out.println(scores[i]);
    }
        System.out.println("============================================");

    for(int each : scores){
        System.out.println(each);
    }
        System.out.println("============================================");

        int j = 0;
        for(int each : scores){
            scores[j] = j+1;
            j++;
            System.out.println(j);
        }




    }
}
