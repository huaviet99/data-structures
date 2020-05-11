package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquareAllArrayElementsTest {
    @Test
    public void testCase1() {
        int[] array = new int[]{1, 3, 5, -3};
        int n = 4;
        int[] squaredArray = ArrayExamples.squareAllArrayElements(array, n);
        assertArrayEquals(new int[]{1, 9, 25, 9}, squaredArray);
    }

    @Test
    public void testCase2() {
        int[] array = new int[]{1, 2, 3, 4};
        int n = 4;
        int[] squaredArray = ArrayExamples.squareAllArrayElements(array,n);
        assertArrayEquals(new int[]{1,4,9,16},squaredArray);
    }


    @Test
    public void testCase3() {
        int[] array = new int[]{0,4,6,8,3,5};
        int n = 6;
        int[] squaredArray = ArrayExamples.squareAllArrayElements(array,n);
        assertArrayEquals(new int[]{0,16,36,64,9,25},squaredArray);
    }

}
