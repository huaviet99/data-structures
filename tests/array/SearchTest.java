package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void testCase1() {
        int[] array = new int[]{1, 2, 3, 1};
        int index = ArrayExamples.linearSearch(array, 4, 1);
        assertEquals(0, index);
    }


    @Test
    public void testCase2() {
        int[] array = new int[]{1, 2, 3};
        int index = ArrayExamples.linearSearch(array, 3, 4);
        assertEquals(-1, index);
    }

    @Test
    public void testCase3() {
        int[] array = new int[]{1, 2, 3, 3, 2, 1, 5, 5, 2};
        int index = ArrayExamples.linearSearch(array, 9, 5);
        assertEquals(6, index);
    }

    @Test
    public void testCase4() {
        int[] array = new int[]{1, 2, 3, 4};
        int index = ArrayExamples.binarySearchRecursive(array, 4, 3);
        assertEquals(2, index);
    }

    @Test
    public void testCase5() {
        int[] array = new int[]{2, 2, 2, 2, 2};
        int index = ArrayExamples.binarySearchRecursive(array, 5, 2);
        assertEquals(0, index);
    }

    @Test
    public void testCase6() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int index = ArrayExamples.binarySearchRecursive(array, 5, 6);
        assertEquals(-1, index);
    }
}