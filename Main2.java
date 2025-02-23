import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void iterateCubes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("i : " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }


    public static void iterateSquares(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(generateRandomArray(1000));
        ArrayList<Integer> arr2 = new ArrayList<>(arr1);

        System.out.println(arr1);
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort1(arr1));

        System.out.println(arr2);
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort2(arr2));
    }

    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000000));
        }
        return list;
    }
}



