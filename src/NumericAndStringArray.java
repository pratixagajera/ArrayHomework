import java.util.Arrays;

public class NumericAndStringArray
{
    public static void main(String[] args) {
        int[] numeric = {23,765,68,94,6345,3256,76};/*given  numeric array*/

        String[] data = {"astha", "riya", "foram", "sweta"};/*given string array*/

        System.out.println("Original numeric array : " +Arrays.toString(numeric));/*print message for original numeric array*/
        Arrays.sort(numeric);
        System.out.println("Sorted numeric array : " +Arrays.toString(numeric));/*print after sorted numeric array*/

        System.out.println("Original string array : " +Arrays.toString(data));/*print before sorted string array*/
        Arrays.sort(data);
        System.out.println("Sorted string array : " +Arrays.toString(data));/*print after sorted string arrays*/
    }
}
