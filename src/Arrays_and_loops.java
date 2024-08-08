import java.util.Arrays;
import java.util.Scanner;

public class Arrays_and_loops {
    public static void main(String[] args) {

//        int [] array = {1, 2, 3, 4, 5};
//
//        int array2 [] = new int[10];
//
//        int array3 [] = new int[10];
//
//        int [] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int arrayM [] [] = new int[3][3];
//
//        int arrayM2 [] [] = {
//                {1, 2, 3, 4},
//                {5, 6, 7},
//                {8, 9, 10, 11, 12, 13, 14},
//                            };



//        int [] array = new int[10];
//        int [] [] arrayM = new int[5][7];
//
//        for (int i = 0; i < array.length; i++){
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
////        for (int i = 10; i > 0; i--){
////            System.out.println(i);
////        }
//        for (int i = 1; i < 11; i++){
//            for (int j = 1; j < 11; j++){
//                System.out.println(i + "*" + j + "=" + i*j);
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arrayM.length; i++){
//            for (int j = 0; j < arrayM[0].length; j++){
//                arrayM[i][j] = i+j;
//            }
//        }
//
//        for (int i = 0; i < arrayM.length; i++){
//            for (int j = 0; j < arrayM[0].length; j++){
//                System.out.println(arrayM[i][j]);
//            }
//            System.out.println();
//        }

//        int [] arr = new int[] {4, 3, 0, -2, 9, 1, 90, 88};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] < arr[j]){
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(getValue(arr, 7));

        String [] str = new String[] {"Java", "Python", "Ruby", "C#", "C++"};

        for (String tmp : str) {
            if (tmp.contains("C")){
                System.out.println(tmp);
            }
        }

        Scanner scanner = new Scanner(System.in);

//        while (!scanner.nextLine().equals("exit")){
//            String name = scanner.nextLine();
//            if (name.equals("Roberto")) {
//                System.out.println("This is Roberto");
//            } else if (name.equals("Alice")) {
//                System.out.println("this is Alice");
//            }
//        }

        do {
            System.out.println("Good work");
        } while (scanner.nextInt() > 5);



        }
        public static int getValue(int[] array, int number){
            for (int i = 0; i < array.length; i++){
                if (array[i] == number){
                    return array[i];
                }
            }
            return -1;
    }
}
