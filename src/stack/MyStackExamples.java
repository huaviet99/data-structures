package stack;

public class MyStackExamples {

    public static String reverseString(String string) {
        String reversedString = new String();
        MyStack<Character> myStack = new MyStack<Character>();
        for (int i = 0; i < string.length(); i++) {
            myStack.push(string.charAt(i));
        }

        while (!myStack.isEmpty()) {
            try {
                reversedString = reversedString + myStack.peek();
                myStack.pop();
            } catch (Exception e) {
                e.fillInStackTrace();
            }

        }
        return reversedString;
    }

    public static String convertPositiveDecimalToBinary(int n) {
        String binaryNumber = new String();
        MyStack<Character> myStack = new MyStack<Character>();

        while (n > 0) {
            myStack.push((char) ((n % 2) + '0'));
            n = n / 2;
        }

        while (!myStack.isEmpty()) {
            try {
                binaryNumber = binaryNumber + myStack.peek();
                myStack.pop();
            } catch (Exception e) {
                e.fillInStackTrace();
            }

        }
        return binaryNumber;
    }

}
