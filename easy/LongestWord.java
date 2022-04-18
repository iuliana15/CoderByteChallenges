package longestword;

import java.util.*;
import java.io.*;

/**
 * Have the function LongestW(sen) take the sen parameter being passed and
 * return the longest word in the string. If there are two or more words that
 * are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty. Words may also contain
 * numbers, for example "Hello world123 567"
 */
public class LongestWord {

    public static String LongestW(String sen) {
        
        sen = sen.trim();
        String[] arr = sen.split("[\\W]+");
        List<String> res = new ArrayList<>();
        res.addAll(Arrays.asList(arr));
        res.sort((s1, s2) -> s1.length() - s2.length());

        return res.get(res.size()-1);
    }

    public static void main(String[] args) {

        System.out.println(LongestW("hello world!"));
        System.out.println(LongestW("Hello world123 567"));        
        System.out.println(LongestW("Helloooooooo345678 dcfvhj87 ctyvubnuvyctryvubnjbuvyc world123 567"));


    }

}
