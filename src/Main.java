import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr1 = new int[3];
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {10, 15, 33, 45};

    } // не понятно как   , последнюю убрать?

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int a = 0; a < arr2.length; a++) {
            System.out.print(arr2[a] + ", ");
        }
        System.out.println();

        int[] arr3 = {10, 15, 33, 45};
        for (int b = 0; b < arr3.length; b++) {

            System.out.print(arr3[b] + ", ");
        }
        System.out.println();

        System.out.println("Hello");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr1 = {1, 2, 3};

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        int[] arr3 = {10, 15, 33, 45};
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr4.length; i++) {
            if (i % 2 != 0) {

                System.out.printf(arr4[i] + ", "); // не понятно как  ,  последнюю убрать?
            }
        }
    }

}


//int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//    weights[0] = 90;
//    int januaryWeight = weights[0];
//
//        System.out.println(januaryWeight);
//    System.out.println(weights[0]);
//            System.out.println(weights[4]);
//            int january = 0;
//            System.out.println(weights[january]);
//
//            for (int i = 0; i < weights.length; i++) {
//    System.out.println(weights[i]);
//
//    }
//
//    int[] arr = new int[10];
//    System.out.println(Arrays.toString(arr));

//
