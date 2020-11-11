package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "abbacaa";
        String result = "";

       for(int j = 0; j <= str.length()-1; j++) {


           char ch = str.charAt(j);
           int count = 0;

           for (int i = 0; i <= str.length() - 1; i++) {
               if (ch == str.charAt(i)) {
                   count++;
               }

           }
           if(result.contains( ""+ch)){
           continue;
           }
           result += ""+ch+count;

       }
           System.out.println(result);



    }
}
