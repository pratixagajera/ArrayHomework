import java.util.Scanner;

public class ReverseArrayValues {

    /*main method*/
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6};/*given array*/
        System.out.println("Original Array : ");

        for (int i = 0; i <numbers.length ; i++)/*for loop to print original array*/
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order : ");/*for loop to print reverse array value*/
        for (int i = numbers.length-1; i >=0 ; i--)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
