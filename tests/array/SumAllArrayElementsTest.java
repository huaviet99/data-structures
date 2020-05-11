package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumAllArrayElementsTest {


    @Test
    public void testCase1() {
        int[] array = new int[]{1, 3, 5, -3, 0};
        int n = 5;
        int sum = ArrayExamples.sumAllArrayElements(array, n);
        assertEquals(6, sum);
    }

    @Test
    public void testCase2() {
        int[] array = new int[]{1, 2, 3, 4};
        int n = 4;
        int sum = ArrayExamples.sumAllArrayElements(array, n);
        assertEquals(10, sum);
    }

    @Test
    public void testCase3() {
        int[] array = new int[]{-1, -6, -7, -8, 20};
        int n = 5;
        int sum = ArrayExamples.sumAllArrayElements(array, n);
        assertEquals(-2, sum);
    }

}
