package day14_Switch_Recap;

public class DaysInMonth2 {
    public static void main(String[] args) {

        int year=2020;
        String month="Mar";

        String result="";

        switch(month){

            case"Feb":result=(year%4==0)?"29days":"28days";break;
            case"Apr":
            case"Jun":
            case"Sep":
            case"Nov":result="30days";break;
            case"Jan":
            case"Mar":
            case"May":
            case"Jul":
            case"Aug":
            case"Oct":
            case"Dec":result="31days";break;
            default:result="Invalid";
            }
            System.out.println(result);

    }
}
