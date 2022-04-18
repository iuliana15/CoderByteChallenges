package firstfactorial;

/**
 * Have the function FFactorial(num) take the num parameter being passed and
 * return the factorial of it. For example: if num = 4, then your program should
 * return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1
 * and 18 and the input will always be an integer.
 */
public class FirstFactorial {

    public static int FFactorial(int num) {

        if (num == 1) {
            return 1;
        }
        return num * FFactorial(num - 1);
    }

    public static void main(String[] args) {

        System.out.println(FFactorial(2));
        System.out.println(FFactorial(3));
        System.out.println(FFactorial(5));
        System.out.println(FFactorial(10));
        System.out.println(FFactorial(4));
        System.out.println(FFactorial(15));

    }

}
