package findintersection;

import java.util.*;
import java.io.*;

/**
 * Have the function Intersection(strArr) read the array of strings stored in
 * strArr which will contain 2 elements: the first element will represent a list
 * of comma-separated numbers sorted in ascending order, the second element will
 * represent a second list of comma-separated numbers (also sorted). Your goal
 * is to return a comma-separated string containing the numbers that occur in
 * elements of strArr in sorted order. If there is no intersection, return the
 * string false.
 */
public class FindIntersection {

    public static String Intersection(String[] strArr) {

        String[] arr = strArr[0].split(", ");
        String[] arr1 = strArr[1].split(", ");
        ArrayList<String> li = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i].equals(arr1[j])) {
                    li.add(arr[i]);
                    break;
                }
            }
        }
        if (li.isEmpty()) {
            return "false";
        } else {
            String res = "";
            for (int i = 0; i < li.size() - 1; i++) {
                res += li.get(i) + ",";
            }
            res += li.get(li.size() - 1);
            return res;
        }

    }

    public static void main(String[] args) {

        System.out.println(Intersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));

    }

}
