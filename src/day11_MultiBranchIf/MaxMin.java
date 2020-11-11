package day11_MultiBranchIf;

public class MaxMin {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 8;

        if (n1 > n2) {

            System.out.println(n1 + " is the maximum number");

        } else {

            System.out.println(n2 + " is the maximum number");
        }

        System.out.println("================================================");

        String maxnumber = (n1 > n2) ? n1 + " is the maximum number" : n2 + " is the maximum number";

        System.out.println(maxnumber);

        System.out.println("=========================================================");

            if (n1 < n2) {

            System.out.println(n1 + " is the minimum number");

            }else {

                System.out.println(n2 + " is the minimum number");

            }

        System.out.println("===============================================");






    }
}
