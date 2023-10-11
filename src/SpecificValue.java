
import java.util.Scanner;


public class SpecificValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Please enter a number");/*print message*/
        int number = scanner.nextInt();

        int[] num = {43, 12, 53, 40, 15};/*given array*/
        int specificValue = number;
        boolean found = false;/*boolean datatype*/

        for (int n : num) /*for loop to find specific value contain in array  */
        {
            if (n == specificValue) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Array contains number " + specificValue);
        }else {
            System.out.println(specificValue + " is not found in given array");
        }
    }
}
