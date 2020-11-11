package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat", "Aliya", "Bektemir", "Pedro"};
        int[] employeSalary =    {100000,  110000,   105000,  120000,    125000,  125000,  125000,     100000};

        int max = employeSalary[0];
        for(int each : employeSalary){
            if(each > max){
                max = each;
// find the maximum salary
            }
        }

        System.out.println("Maximum Salary of employee: " + max);

        for(int i = 0; i <= employeeNames.length-1; i++){
        if(max == employeSalary[i]) {
            System.out.println(employeeNames[i]);
 // names of the employee with maximum salary

           }
        }





    }
}
