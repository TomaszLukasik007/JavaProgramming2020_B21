package day13_SwitchStatement;

public class Task_1 {
    public static void main(String[] args) {

    /*    write a program that cna print the name of the month based on the number.
        if numbers is greater than 12 or less than 1, print invalid
        MUST use switch  */

        int month =4;
        String nameofmonth = "";

        switch (month) {

            case 1:
                nameofmonth = "January";
                break;
            case 2:
                nameofmonth = "February";
                break;
            case 3:
                nameofmonth = "March";
                break;
            case 4:
                nameofmonth = "April";
                break;
            case 5:
                nameofmonth = "May";
                break;
            case 6:
                nameofmonth = "June";
                break;
            case 7:
                nameofmonth = "July";
                break;
            case 8:
                nameofmonth = "August";
                break;
            case 9:
                nameofmonth = "September";
                break;
            case 10:
                nameofmonth = "October";
                break;
            case 11:
                nameofmonth = "November";
                break;
            case 12:
                nameofmonth = "December";
                break;

            default:
                System.out.println("Invalid");
                break;
            }
        System.out.println(nameofmonth);

    }
}
