import java.util.Scanner;

public class GivenelementPresentOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Please enter a number : ");/*print message*/
        int number = scanner.nextInt();

        int[] num = {1, 2, 3, 4, 5};/*given array*/
        int specificValue = number;
        boolean found = false;/*boolean datatype*/

        for (int n : num) /*for loop to find element in array*/
        {
            if (n == specificValue) {
                found = true;
                break;
            }
        }

        if(found) /*if else to print contains number or not*/
        {
            System.out.println("Array contains number " + specificValue);
        }else {
            System.out.println(specificValue + " is not found in given array");
        }
    }
}
