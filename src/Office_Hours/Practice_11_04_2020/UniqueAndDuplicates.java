package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scan.next();

        String unique = "";
        String duplicates = "";

        for(int j=0; j <= str.length()-1; j++) {


            char ch = str.charAt(j);

            int frequency = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }
       if(frequency > 1){
           duplicates += ch;
          }

        }

        System.out.println("Unigue: "+unique);
        System.out.println("Duplicates: "+duplicates);
    }
}
