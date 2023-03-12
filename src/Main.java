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
        char[] arr3 = {'a', 'b', 'c', 'd' };
    }


    public static void task2() {
        System.out.println("Задание 2");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd' };

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd' };

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 2 != 0) {
                arr4[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr4));
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
