import java.util.Scanner;

public class FindCommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);/*scanner class*/
        System.out.println("Enter the size of an array one : ");/*print message*/
        int one = scanner.nextInt();
        int[] arraySizeOne = new int[one];/*create array size*/
        System.out.println("Enter the elements of an array : ");/*print message*/
        for (int i = 0; i <arraySizeOne.length ; i++)/*for loop for first array*/
        {
            arraySizeOne[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of an Array two : ");/*print message*/
        int two = scanner.nextInt();
        int[] arraySizeTwo = new int[two];/*create array size*/

        System.out.println("Enter the elements of an Array two : ");/*print message*/
        for (int i = 0; i <arraySizeTwo.length ; i++)/*for loop for second array*/
        {
         arraySizeTwo[i] =scanner.nextInt();
        }

        for (int i = 0; i <arraySizeOne.length ; i++)/*for loop to find common element between two arrays*/
        {
            for (int j = 0; j <arraySizeTwo.length ; j++) {
                if (arraySizeOne[i] == arraySizeTwo[j])
                {
                    System.out.println("The common elements between two arrays are : " +arraySizeOne[i]);
                    break;
                }
            }
        }
    }
}
