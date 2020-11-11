package day13_SwitchStatement;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {


        String Browser = "cybertek";
        String selectedBrowser = "";

            switch (Browser) {

            case  "chrome":
                selectedBrowser = "Chrome Broser";
                break;
            case  "firefox":
                selectedBrowser = "Firefox Broser";
                break;
            case  "opera":
                selectedBrowser = "Opera Broser";
                break;
            case  "safari":
                selectedBrowser = "Safari Broser";
                break;
            case  "edge":
                selectedBrowser = "Edge Broser";
                break;
            case  "ie":
                selectedBrowser = "IE Broser";
                break;

                default : selectedBrowser = "Invalid Browser Name";

            }

            System.out.println(selectedBrowser);

    }
}
