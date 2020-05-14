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


    public static int linearSearch(int[] array, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (x == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int n, int x) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int n, int x) {
        int left = 0;
        int right = n - 1;
        return binarySearchRecursiveImpl(array, left, right, x);
    }

    private static int binarySearchRecursiveImpl(int[] array, int left, int right, int x) {
        if (left == right) {
            if (array[left] == x) {
                return left;
            } else {
                return -1;
            }
        } else {
            int mid = (left + right) / 2;
            if (x == array[mid]) {
                return mid;
            } else if (x < array[mid]) {
                return binarySearchRecursiveImpl(array, left, mid - 1, x);
            } else {
                return binarySearchRecursiveImpl(array, mid + 1, right, x);
            }
        }
    }


    public static int[] bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
