package org.example;

import String.String;

public class CharacterCount {
    public static void main(String[] args) {
        java.lang.String str = "Hello World";
        char ch = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The number of occurrences of the character " + ch + " in the string \"" + str + "\" is: " + count);
    }
}
