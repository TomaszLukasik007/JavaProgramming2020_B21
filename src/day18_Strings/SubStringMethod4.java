package day18_Strings;

public class SubStringMethod4 {
    public static void main(String[] args) {


        String str = "Hello Everyone";
        System.out.println(str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        String sentence = "I like to leran Java";

        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.contains("Java"));

        String webAddress = "www.amazon.com";

        boolean validAddress = webAddress.startsWith("www.") && webAddress.endsWith(".com");











    }
}
