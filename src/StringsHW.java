import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(String.format(s1 + " %s", s2));
        System.out.println(getAvgValueFromString(scanner.nextLine()));

        System.out.println(palindromeCheck(scanner.nextLine()));
        System.out.println(phoneNumberCheck(scanner.nextLine()));

    }
    public static String getAvgValueFromString(String str){
        String s = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        return s;
    }
    public static boolean palindromeCheck(String str){
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        String word2 = word.toString();
        boolean b = word2.equalsIgnoreCase(str);
        return b;
    }
    public static boolean phoneNumberCheck (String target){
        Pattern pattern = Pattern.compile("^((\\+380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(target);
        return matcher.matches();
    }
}
