package day20_WhileLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "ABCD";
                    //0123
        String result = "";     //we want contain thr expected result which is the reversed version os str
//                    3                 0
        for(int i=str.length()-1 ; i >= 0; i--){       // i: 3,2,1,0
            result += str.charAt(i);
        }
        System.out.print(result);









    }
}
