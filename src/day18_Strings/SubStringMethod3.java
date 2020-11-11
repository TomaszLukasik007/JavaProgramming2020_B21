package day18_Strings;

public class SubStringMethod3 {
    public static void main(String[] args) {


        String sentence = "Java is fun, Java is cool";

        sentence = sentence.replace("Java", "Python"); // Python is fun , Python is cool

        System.out.println(sentence);


        String email = "CybertekSchool@gmail.com";

        email = email.replace("gmail","yahoo");

        System.out.println(email);


        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students ar awesome";

        essay = essay.replace("0", "1");

        System.out.println(essay);

        String s = "I like to learn C# is very cool";

        s = s.replace("C#", "Java");

        System.out.println(s);

        System.out.println("==============================================================");

        String r = "Cat is friendly, Cat is cute";

        r = r.replaceFirst("Cat", "Dog");

        System.out.println(r);

        String t = "I like to learn Java, because Java is cool, Java is powerful";

        t = t.replaceFirst("Java is", "Python is").replaceFirst("Java", "C#");

        System.out.println(t);

        String a = "Yesterday was Monday, Today is Monday, Tommorow is gonna be Monday";

        a = a.replaceFirst("Monday", "Sunday").replaceFirst(" be Monday", " be Tuesday");

        System.out.println(a);


        String b = "Yesterday was Monday, Today is Monday, Tommorow is gonna be Monday";
        b = b.replaceFirst("Monday", "Sunday");
        b = b.replaceFirst("e Monday", "e Tuesday");

        System.out.println(b);

        System.out.println("==============================================================");

        String emailAddress = "Cybertek_School@gmail.com";

        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingindex = emailAddress.indexOf(".com");

        String domain = emailAddress.substring(beginningIndex, endingindex);
        System.out.println(domain);

        System.out.println("==============================================================");

        String p = "I like to watch movies and reading books";

        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        System.out.println("==============================================================");

        String y = "I like to learn Java, Java is cool, I like to watch Jumanji ";

        int n1 = y.indexOf("Java ");  // second J' index

        System.out.println(n1);

        int n2 = y.lastIndexOf("J");

        System.out.println(n2);

        System.out.println("==============================================================");

        String name = "My name is Tomasz";

        String result =name.substring(name.lastIndexOf("T"));


        System.out.println(result);





    }
}
