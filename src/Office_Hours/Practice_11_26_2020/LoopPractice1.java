package Office_Hours.Practice_11_26_2020;

public class LoopPractice1 {

    public static void main(String[] args) {
        System.out.print("All numbers: ");
        for(int i = 1; i <= 50; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.print("Even numbers: ");
        for(int i = 2; i <= 50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.print("Odd numbers: ");
        for(int i = 1; i <= 49; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("==================================================================");


        System.out.print("Even numbers: ");
        for(int i =1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");

            }
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for(int i =1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.print("Odd numbers: ");
        for(int i =1; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");

       if(i == 29){
           break; //exits the loop

            }

        }




    }
}
