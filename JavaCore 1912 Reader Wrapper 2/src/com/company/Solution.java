package com.company;

/*

1912 Reader Wrapper 2
In the main method, replace the System.out object with the reader wrapper you wrote, similar to a lecture.
Your reader wrapper should replace all substrings "te" with "??".
Call the ready printSomething () method, use testString.
Return the System.out variable to its original stream.
Print the modified string to the console.

Requirements:
1. The Solution class must contain the TestString class.
2. The Solution class must contain a public static field testString of type TestString, which is immediately initialized.
3. The TestString class must contain the public void method printSomething ().
4. The printSomething () method of the TestString class should display the string "it's a text for testing".
5. The main (String [] args) method of the Solution class should create a PrintStream stream (use PrintStream with the ByteArrayOutputStream constructor parameter).
6. The main (String [] args) method of the Solution class should replace and restore the output stream to the console of the System.out object
7. The main (String [] args) method of the Solution class should call the printSomething () method of the testString object.
8. The main (String [] args) method of the Solution class must modify the line printed by the printSomething () method according to the task and print it to the console.

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();
    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        System.out.println(outputStream.toString().replace("te", "??"));
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("It's a text for testing");
        }
    }
}






