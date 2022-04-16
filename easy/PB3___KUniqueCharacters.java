package pb3___kuniquecharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PB3___KUniqueCharacters {

    /*
Using the Java language, have the function KUniqueCharacters(str)
take the str parameter being passed and find the longest substring
that contains k unique characters, where k will be the first character
from the string. The substring will start from the second position
in the string because the first character will be the integer k.
For example: if str is "2aabbacbaa" there are several substrings
that all contain 2 unique characters, namely: ["aabba", "ac", "cb", "ba"],
but your program should return "aabba" because it is the longest substring.
If there are multiple longest substrings, then return the first substring
encountered with the longest length. k will range from 1 to 6. 
Input:"3aabacbebebe"
Output:"cbebebe"
Input:"2aabbcbbbadef"
Output:"bbcbbb"
     */
    public static String KUniqueCharacters(String str) {
        int k;
        k = Character.getNumericValue(str.charAt(0));
        str = str.substring(1);
        // base case
        if (str == null || str.length() == 0 || str.length() == k) {
            return str;
        }
 
        // stores the longest substring boundaries
        int end = 0, begin = 0;
 
        // set to store distinct characters in a window
        HashSet<Character> window = new HashSet<>();
 
        // Count array `freq` stores the frequency of characters present in the
        // current window. We can also use a map instead of a count array.
        int[] freq = new int[26];
        
        // `[low…high]` maintains the sliding window boundaries
        for (int low = 0, high = 0; high < str.length(); high++)
        {
            window.add(str.charAt(high));
            freq[str.charAt(high)-'a']++;
 
            // if the window size is more than `k`, remove characters from the left
            while (window.size() > k)
            {
                // If the leftmost character's frequency becomes 0 after
                // removing it in the window, remove it from the set as well
                freq[str.charAt(low)-'a'] -= 1;
                System.out.println(low+" "+ (str.charAt(low)-'a')+" "+freq[str.charAt(low)-'a']);

                if (freq[str.charAt(low)-'a'] == 0) {
                    window.remove(str.charAt(low));
                }
 
                low++;        // reduce window size
            }
 
            // update the maximum window size if necessary
            if (end - begin < high - low)
            {
                end = high;
                begin = low;
            }
        }
 
        // return the longest substring found at `str[begin…end]`
        return str.substring(begin, end + 1);
    }

    public static void main(String[] args) {
        //String a = "2aabbcbbbadef";
        //KUniqueCharacters(a);

        String b = "3aabacbebebe";
        System.out.println(KUniqueCharacters(b));
    }

}
