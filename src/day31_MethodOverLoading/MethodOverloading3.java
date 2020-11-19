package day31_MethodOverLoading;

public class MethodOverloading3 {

    double[] arr = {1.5, 2.5, 3.5, 0, 0.5, 1};

    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    public static double max(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min =arr[0];
        for( int each  : arr ){
            if(each > min){
                min = each;
            }
        }
        return min;
    }
    public static double min(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each > min) {
                min = each;
            }
        }
        return min;
    }

}
