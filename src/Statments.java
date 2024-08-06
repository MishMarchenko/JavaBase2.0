import java.util.Scanner;

public class Statments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a > b || c < d) {
            System.out.println("First digit is bigger");
        } else {
            System.out.println("Second digit is bigger");
        }


        switch (a){
            case 1:
                System.out.println("This is one");
                break;
            case 10:
                System.out.println("This is ten");
                break;
            default:
                System.out.println("Doesn't right");
        }
        String s = a > 10 ? "Bigger" : "Shorter";
        System.out.println(s);
    }
}
