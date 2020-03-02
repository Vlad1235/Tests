package com.hamcrest;

/**
 * Проверяет, что слово начинается с префикса.
 */
public class ArrayChar {
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i <= pref.length - 1; i++) {
            if (pref[i] == wrd[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
