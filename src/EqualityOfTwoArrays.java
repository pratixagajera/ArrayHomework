import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfTwoArrays {
    public static void main(String[] args)
    {
        /*scanner class*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array one : ");/*print message*/
        int one = scanner.nextInt();
        int[] arraySizeOne = new int[one];/*array size*/
        System.out.println("Enter the elements of an array : ");/*print message*/
        for (int i = 0; i <arraySizeOne.length ; i++)/*for loop for first array value*/
        {
            arraySizeOne[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of an Array two : ");/*print message*/
        int two = scanner.nextInt();
        int[] arraySizeTwo = new int[two];

        System.out.println("Enter the elements of an Array two : ");/*print message*/
        for (int i = 0; i <arraySizeTwo.length ; i++)/*for loop for second array*/
        {
            arraySizeTwo[i] =scanner.nextInt();
        }

        System.out.println(Arrays.equals(arraySizeOne, arraySizeTwo));/*to find equality*/
    }
}
