import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        getUnicode();
        System.out.println(getCubeOfNumber(5));
        System.out.println("it's calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add first digit");
        int a = scanner.nextInt();
        System.out.println("Add +, -, *, /");
        char s = scanner.next().charAt(0);
        System.out.println("Add second digit");
        int b = scanner.nextInt();
        if (s == '+'){
            System.out.println(getSum(a, b));
        } else if (s == '-') {
            System.out.println(getSubtract(a,b));
        } else if (s == '*') {
            System.out.println(getMultiply(a, b));
        } else if (s == '/') {
            System.out.println(getDivide(a, b));
        } else {
            System.out.println("I don't know this operator");
        }
    }
    public static void getUnicode(){
        char a = '\u21E6';
        char b = '\u21E7';
        char c = '\u21E8';
        System.out.println(a + " " + b + " " + c);
    }
    public static int getCubeOfNumber(int a){
        return (int) Math.pow(a, 3);
    }
    public static int getSum(int a, int b){
        return a + b;
    }
    public static int getSubtract(int a, int b){
        return a - b;
    }
    public static int getMultiply(int a, int b){
        return a * b;
    }
    public static int getDivide(int a, int b){
        return a / b;
    }
}
