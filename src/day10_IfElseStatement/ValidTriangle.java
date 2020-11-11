package day10_IfElseStatement;

public class ValidTriangle {
    public static void main(String[] args) {

        int angle1 = 60;
        int angle2 = 60;
        int angle3 = 60;

        boolean isValid = (angle1+angle2+angle3) == 180;
            // is sum of three angles eqaul to 180, than it's validtriangle ==> true
            //otherwise==> false
        if(isValid){
            System.out.println("It's a valid triangle");
        }

        if(!isValid) {
            System.out.println("It's not a valid triangle");
        }
           // if it's valid triangle, than check if it's a right triangle

    }
}
