import java.util.Scanner;

public class IndexOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Given Array is : 5, 19,20,42,87");/*print for array*/
        System.out.println("Please enter a number from given array : ");/*print message*/
        int a = scanner.nextInt();

        int[] numbers = {5,19,20,42,87};/*given array*/
        int value = a;
        int index = 0;
        for (int i = 0; i < numbers.length ; i++) /*for loop to find index of an array*/
        {
            if (numbers[i] == value)
            {
                index = i;
                break;
            }
        }
        System.out.println( value+" is located at " + index + " index");/*print message for final output*/
    }
}
