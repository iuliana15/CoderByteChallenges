package firstreverse;

/**
 * Have the function FReverse(str) take the str parameter being passed and
 * return the string in reversed order. For example: if the input string is
 * "Hello World and Coders" then your program should return the string sredoC
 * dna dlroW olleH.
 */
public class FirstReverse {

    public static String FReverse(String str) {

        StringBuffer b = new StringBuffer(str);
        b = b.reverse();
        return b.toString();

    }

    public static void main(String[] args) {

        System.out.println(FReverse("Hello World and Coders"));

    }

}
