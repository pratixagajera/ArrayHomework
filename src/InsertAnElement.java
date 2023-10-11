import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Please enter a number that you want to add : ");/*print message to add element*/
        int a = scanner.nextInt();
        System.out.println("Please enter a index position where you want to add a number: ");/*print message for find where they want to add in array*/
        int b = scanner.nextInt();

        int[] arrayValue = {12, 24, 39, 41, 50, 64, 83, 91};/*given array*/
        int indexPosition = b;
        int newElement = a;

        System.out.println("Original Array : " + Arrays.toString(arrayValue));

        for (int i = arrayValue.length-1; i >indexPosition; i--)/*for loop to insert element to given index*/
        {
         arrayValue[i]=arrayValue[i-1];
        }
        arrayValue[indexPosition] = newElement;
        System.out.println("New Array : " +Arrays.toString(arrayValue));/*print message for final output*/
    }
}
