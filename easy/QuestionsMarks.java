package questionsmarks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Have the function QuestionsMarks(str) take the str string parameter, which
 * will contain single digit numbers, letters, and question marks, and check if
 * there are exactly 3 question marks between every pair of two numbers that add
 * up to 10. If so, then your program should return the string true, otherwise
 * it should return the string false. If there aren't any two numbers that add
 * up to 10 in the string, then your program should return false as well.
 *
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should
 * return true because there are exactly 3 question marks between 6 and 4, and 3
 * question marks between 5 and 5 at the end of the string.
 */
public class QuestionsMarks {

    public static String Questions(String str) {
        str = str.replaceAll("[a-z]", "");
        Pattern p = Pattern.compile("([0-9][?]{3}[0-9])");
        Matcher m = p.matcher(str);
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1, match.length()));
            if (a + b == 10) {
                if (match.length() == 5) {
                    return "true";
                }
            }
        }
        return "false";
    }

    public static void main(String[] args) {

        System.out.println(Questions("9??1??9??1??9"));        
        System.out.println(Questions("arrb6???4xxbl5???eee5"));

    }

}
