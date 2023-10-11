
public class SumOfArray {

    public static void main(String[] args)
    {
        int [] value = {34 , 65 , 86, 95};/*given array*/
        int sum = 0;

        for (int i = 0; i <value.length ; i++) /*for loop to find sum of given array*/
        {
            sum += value [i];
        }
        System.out.println("The sum of array is : " +sum);/*print message for final output*/
    }
}
