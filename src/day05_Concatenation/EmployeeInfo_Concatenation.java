package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {
        String firstName = "Mike"; //"" for the texts
        String lastName = "Tyson";
        String fullName =   firstName+" "+lastName; // string ==> text
        char gender = 'M'; // '' for single character
        int age = 30;
        String companyName = "Bank Of America";
        String jobTitle = "Software Developer";
        double salary = 150000; //120000.0
        boolean isFullTime = false;
        boolean isMarried = true;

        System.out.println("Emplyee' full name is: "+fullName);
        System.out.println(fullName +"' gender is: "+gender );
        System.out.println(fullName+"' age is: "+age+" years old");
        System.out.println(fullName+" works at "+ companyName);
        System.out.println(fullName+"'s job title is: "+jobTitle);
        System.out.println(fullName+"'s salary is: $ " + salary);





    }
}
