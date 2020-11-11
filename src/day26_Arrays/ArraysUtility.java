package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers);   //hashcode

        System.out.println( Arrays.toString(numbers) );



        String[] classMates = {"Sayera", "Aigerim", "Cassandra", " Gentrit", "Sevara"};

        System.out.println( classMates ); // hashcode

        System.out.println( Arrays.toString(classMates) );

        System.out.println("========================================================");

        int[] arr1 = {20000, 1000000, 4000000, 6000, 300000, 12345551, 90000};

        Arrays.sort(arr1); // does not return any value, cannot be assigned to a variable not pass it in print statement

        System.out.println( Arrays.toString(arr1) );
        System.out.println("Max: "+arr1[arr1.length-1]);
        System.out.println("Min: "+arr1[0]);

        System.out.println("========================================================");

        double[] arr2 = {1.5,0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5 };

        Arrays.sort(arr2);

        System.out.println( Arrays.toString( arr2 ));

        System.out.println("Second minimum number: "+arr2[1]);
        System.out.println("Second maximum number: "+arr2[arr2.length-1-1]);

        System.out.println("=========================================================");

        int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr);


        for(int i=arr.length-1; i>=0; i--) {
            int descendingNum = arr[i];
            System.out.print(descendingNum + " ");
        }
        System.out.println();
        System.out.println("================================================================");

        String[] names = {"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};
        Arrays.sort(names);

        System.out.println( Arrays.toString(names)  );

        System.out.println("================================================================");

        // equals(arr1, arr2)

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

        Arrays.sort(a1);  //[1, 2, 3]
        Arrays.sort(a2);  //[1, 2, 3]

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);








    }
}
