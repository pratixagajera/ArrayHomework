import java.util.Scanner;

public class DuplicateValue {

    public static void main(String[] args)
    {
        /*scanner class*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Enter the size of an array one : ");
        int one = scanner.nextInt();
        /*array value declared*/
        int[] value = new int[one];
        System.out.println("Enter the elements of an array : ");

        /*for loop for array value*/
        for (int i = 0; i <value.length ; i++)
        {
            value[i] = scanner.nextInt();
        }

        /*print message*/
        System.out.println("Duplicate elements in given arrays : ");

        /*for loop to find duplicate value*/
        for (int i = 0; i <value.length ; i++)
        {
            for (int j = i+1; j <value.length ; j++)
            {
                if (value[i] == value[j])
                    System.out.println(value[j]);
            }
        }
    }
}
