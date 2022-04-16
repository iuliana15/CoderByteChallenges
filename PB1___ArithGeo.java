package pb1___arithgeo;

/* Using the Java language, have the function ArithGeo(arr) take the array of numbers stored in arr 
and return the string "Arithmetic" if the sequence follows an arithmetic pattern or return "Geometric" 
if it follows a geometric pattern. 
 If the sequence doesn't follow either pattern return -1. 
 An arithmetic sequence is one where the difference between each of the numbers is consistent, 
 where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio. 
 Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as parameters, 
 0 will not be entered, and no array will contain all the same elements. 
 */
public class PB1___ArithGeo {

    public static String ArithGeo(int[] arr) {
        if (arr.length > 3) {
            int arith = 0, geo = 0;
            for (int i = 0; i < arr.length-2; i++) {
                if (arr[i+1] - arr[i] == arr[i+2] - arr[i+1]) {
                    arith = 1;
                } else {
                    arith = 0;
                    break;
                }
            }
            for (int i = 0; i < arr.length-2; i++) {
                if (arr[i+1] / arr[i] == arr[i+2] / arr[i+1]) {
                    geo = 1;
                } else {
                    geo = 0;
                    break;
                }
            }
            if(arith == 1 ){
                return "Arithmetic";
            }
            else if(geo == 1){
                return "Geometric";
            }
            else return "-1";
        }

        return "-1";
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        
        int[] arr1 = new int[]{2, 4, 6, 8};
        int[] arr2 = new int[]{2, 6, 18, 54};
        int[] arr3 = new int[]{2, 4, 18, 54};

        System.out.println(ArithGeo(arr1));
        System.out.println(ArithGeo(arr2));        
        System.out.println(ArithGeo(arr3));

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("Time: "+ elapsedTime +" miliseconds");

    }

}
