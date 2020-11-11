package day11_MultiBranchIf;

public class MaxMin2 {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 8;
        int n3 = 11;

        int max1 = 0;


        if (n1 > n2 && n1 > n3) {
            max1 = n1;

        } else if (n2 > n1 && n2 > n3) {
            max1 = n2;

        } else {
            max1 = n3;
        }
        System.out.println("Maximum number is: "+max1);














    }
}
