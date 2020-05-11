package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {


    @Test
    public void testCase1() {
        String reversedString = MyStackExamples.reverseString("code");
        assertEquals("edoc", reversedString);
    }

    @Test
    public void testCase2() {
        String reversedString = MyStackExamples.reverseString("Code leran");
        assertEquals("narel edoC", reversedString);
    }

    @Test
    public void testCase3() {
        String reversedString = MyStackExamples.reverseString("i am programmer");
        assertEquals("remmargorp ma i", reversedString);
    }

}
