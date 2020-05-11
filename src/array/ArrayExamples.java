package array;

public class ArrayExamples {
    public static int sumAllArrayElements(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] squareAllArrayElements(int[] array, int n) {
        int[] squaredArray = new int[n];
        for (int i = 0; i < n; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
}
