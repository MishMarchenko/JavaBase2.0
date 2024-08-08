import java.util.Scanner;

public class HomeWork_AL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] array = new int[scanner.nextInt()];
//        for (int i = 0; i < array.length; i++){
//            array[i] = i + 1;
//        }
//        for (int i = 0; i < array.length; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--){
//            for (int j = 10; j > 0; j--){
//                System.out.println(i + "*" + j + "=" + i *  j);
//            }
//            System.out.println();
//        }
//        System.out.println("Lets play the game!) What digit did i think of?");
//        do{
//            System.out.println("Add number from 1 till 10");
//        } while (scanner.nextInt() != 6);
//
//        System.out.println("Lets play again!)");
//
//        while (scanner.nextInt() != 5){
//            if (scanner.nextInt() < 5) {
//                System.out.println("It's bigger");
//            } else if (scanner.nextInt() > 5) {
//                System.out.println("It's less");
//            } else {
//                System.out.println("it's correct");
//            }
//
//        int [] [] arrayMul = new int[5][8];
//
//        for (int i = 0; i < arrayMul.length; i++){
//            for (int j = 0; j <arrayMul[0].length; j++){
//                arrayMul[i] [j]= j + 1;
//            }
//        }
//        for (int i = 0; i < arrayMul.length; i++){
//            for (int j = 0; j <arrayMul[0].length; j++){
//                System.out.println(arrayMul[i][j]);;
//            }
//            System.out.println();
//        }

        int [] arrayDigit = new int[] {5, 34, 54, -2, 0, 9, 76, 88, 909, 11};

        int tmp = arrayDigit[0];
        for (int i = 1; i < arrayDigit.length; i++){
            if (arrayDigit[i] < tmp){
                tmp = arrayDigit[i];
            }
        }
        System.out.println(tmp);
    }
}
