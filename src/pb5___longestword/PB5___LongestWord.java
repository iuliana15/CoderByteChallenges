package pb5___longestword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * *************************************************************************************
 *                                                                                      *
 * CODERBYTE BEGINNER CHALLENGE * * Longest Word * Using the Java language, have
 * the function LongestWord(sen) take the sen * parameter being passed and
 * return the largest word in the string. If there are * two or more words that
 * are the same length, return the first word from the string * with that
 * length. Ignore punctuation and assume sen will not be empty. * * When working
 * on the solution you have to be aware of the directions that says to * ignore
 * punctuation. That means we need to strip out everything in the string *
 * except for letters a-z and space. Once removed I am going to use the sort() *
 * function for Array to sort each word by length in descending order. The first
 * * entry in the array is the longest word. * 1) Remove anything in string that
 * is not a-z, A-Z or blank * 2) Convert String to Array * 3) Sort Array in
 * descending order based on length of word * 4) First entry in sorted array is
 * solution * *
**************************************************************************************
 */
public class PB5___LongestWord {

    public static String LongestWord(String sen) {
        String[] arr = sen.split("[\\W]+");
        int index = -1;
        int max = -1;
        List<String> rez = new ArrayList<>();
        for(String i : arr){
            rez.add(i);
        }
        rez.sort((s1, s2) -> s1.length() - s2.length());
        for (String i : rez){
            System.out.println(i);
        }
       
        return Collections.max(rez, Comparator.comparing(String::length));
    }

    public static void main(String[] args) {
        String sen =" ashf;kh alkjfl iregergeeree ;a'ag akg";
        System.out.println(LongestWord(sen));
        

    }

}
