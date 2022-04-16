package codelandusernamevalidation;

import java.util.*;
import java.util.regex.*;
import java.io.*;

/**
 * Have the function UsernameValidation(str) take the str parameter
 * being passed and determine if the string is a valid username according to the
 * following rules:
 *
 * 1. The username is between 4 and 25 characters. 
 * 2. It must start with a letter. 
 * 3. It can only contain letters, numbers, and the underscore character. 
 * 4. It cannot end with an underscore character.
 *
 * If the username is valid then your program should return the string true,
 * otherwise return the string false.
 */

public class CodelandUsernameValidation {

    public static String UsernameValidation(String str) {
        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9\\_]+[^\\_]");
        Matcher m = p.matcher(str);
        return m.matches() ? "true" : "false";
        
    }

    public static void main(String[] args) {
        System.out.println(UsernameValidation("iulia"));
        System.out.println(UsernameValidation("..ughd13.."));

    }
}
