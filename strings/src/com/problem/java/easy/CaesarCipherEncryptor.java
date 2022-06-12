package com.problem.java.easy;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipherEncryptor {

    // Time: O(n) | Space: O(n)
    public static String caesarCypherEncryptor(String str, int key) {
        Map<Character, Integer> alphabets = new HashMap<>();
        alphabets.put('a', 1);
        alphabets.put('b', 2);
        alphabets.put('c', 3);
        alphabets.put('d', 4);
        alphabets.put('e', 5);
        alphabets.put('f', 6);
        alphabets.put('g', 7);
        alphabets.put('h', 8);
        alphabets.put('i', 9);
        alphabets.put('j', 10);
        alphabets.put('k', 11);
        alphabets.put('l', 12);
        alphabets.put('m', 13);
        alphabets.put('n', 14);
        alphabets.put('o', 15);
        alphabets.put('p', 16);
        alphabets.put('q', 17);
        alphabets.put('r', 18);
        alphabets.put('s', 19);
        alphabets.put('t', 20);
        alphabets.put('u', 21);
        alphabets.put('v', 22);
        alphabets.put('w', 23);
        alphabets.put('x', 24);
        alphabets.put('y', 25);
        alphabets.put('z', 26);

        StringBuilder cipherTxt = new StringBuilder();
        for (char ch : str.toCharArray()) {
            int cipherInt = (alphabets.get(ch) + key) % 26;
            cipherInt = cipherInt == 0 ? 26 : cipherInt;
            for (Character k : alphabets.keySet()) {
                if (alphabets.get(k) == cipherInt) {
                    cipherTxt.append(k);
                }
            }
        }

        return cipherTxt.toString();
    }
}
