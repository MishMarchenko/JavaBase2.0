import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s3 = "Hello";
        String s4 = " World";
        String s5 = "hello";
        String s2 = new String("Hello");
        StringBuilder stb = new StringBuilder();
        stb.append("Hello");

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(s2).concat(String.valueOf(stb)));
        System.out.println(String.format("Hello is Java - %s", "Java"));
        System.out.println(f(s1, s4));

        String st = s1.toLowerCase();
        System.out.println(st);
        System.out.println(s1.toUpperCase());

        String st1 = "Hello my perfect world";
        System.out.println(st1.replace("l", "g"));
        System.out.println(st1.replaceAll("[abc]", "rep"));

        System.out.println(st1.substring(6, 8));
        String st2 = st1.substring(0, 6).concat(st1.substring(17));
        System.out.println(st2);

        System.out.println(st1.indexOf("l", 5));

        System.out.println(st1.compareTo(s1));

        System.out.println(s1.charAt(2));

        char [] array = new char[10];
        st1.getChars(6, 12, array, 4);
        System.out.println(Arrays.toString(array));

        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(st1.contains("my"));
        System.out.println(st1.length());
        String [] strArray = st1.split(" ");
        System.out.println(Arrays.toString(strArray));











    }
    public static String f(String target, String aim){
        return String.format(target + "%s", aim);
    }
}
