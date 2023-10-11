import java.util.Scanner;

public class ValuesAscendingOrder {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Enter the size of an array one : ");/*print message for size of an array*/
        int one = scanner.nextInt();
        int[] arrayValue = new int[one];
        System.out.println("Enter the elements of an array : ");/*print message for enter array values*/
        for (int i = 0; i <arrayValue.length ; i++)/*for loop to enter array value*/
        {
            arrayValue[i] = scanner.nextInt();
        }
        int temp = 0;
        System.out.println("Original Array elements : ");/*print message for original array */
        for (int i = 0; i <arrayValue.length ; i++) /*for loop for original array*/
        {
            System.out.print(arrayValue[i] + " ");
        }

        for (int i = 0; i <arrayValue.length ; i++) /*for loop for ascending array value*/
        {
            for (int j = i+1; j <arrayValue.length ; j++) {
                if (arrayValue[i] >arrayValue[j])
                {
                    temp = arrayValue[i];
                    arrayValue[i] = arrayValue[j];
                    arrayValue[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorted in ascending order Array elements : ");/*print message*/
        for (int i = 0; i <arrayValue.length ; i++) /*for loop to print ascending array value */
        {
            System.out.print(arrayValue[i] + " ");
        }
    }
}
