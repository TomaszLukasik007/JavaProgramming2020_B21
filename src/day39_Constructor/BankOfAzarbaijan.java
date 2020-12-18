package day39_Constructor;

import day37_CustomClass.Employee;

import java.util.ArrayList;

public class BankOfAzarbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> employess = new ArrayList<>();
         employess.add( HumanResource.employee1 );
         employess.add( HumanResource.employee2 );


        System.out.println(employess.get(0));






    }
}
