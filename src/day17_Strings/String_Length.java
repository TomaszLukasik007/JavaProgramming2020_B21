package day17_Strings;

public class String_Length {
    public static void main(String[] args) {

        String s = "hsjfhksjhfkhsdfhsjdfnsjnfdsnfnslknfsdjlflkdsjmfjmsdklfjksdjfkdjl";
        String s2 = "word";

        System.out.println(s.length());
        System.out.println(s2.length());

        int len = s.length();

        System.out.println(len == s.length());
        System.out.println(len == s2.length());


    }
}
