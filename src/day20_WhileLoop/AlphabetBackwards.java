package day20_WhileLoop;

public class AlphabetBackwards {
    public static void main(String[] args) {
         /*       2. Write a program that will print out all alphabet letters in backwards         */

    for (int i=90; i >=65; i--){
        System.out.print((char)+i+" ");
    }
        System.out.println();

    for (char i='Z'; i >='A'; i--) {
        System.out.print(i + " ");
    }
        System.out.println();

    for (int i=122; i >=97; i-=1){
            System.out.print((char)+i+" ");
        }
        System.out.println();

    for (char i='z'; i >='a'; i-=1){
            System.out.print(i+" ");
        }
    }
}
