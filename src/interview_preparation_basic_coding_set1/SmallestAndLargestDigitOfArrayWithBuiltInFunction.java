package interview_preparation_basic_coding_set1;

import java.util.Arrays;

public class SmallestAndLargestDigitOfArrayWithBuiltInFunction
{

    static void main() {
        int ar[] = new int[]{20, 10, 30, 90, 40, 50, 100, 60, 70, 5, 80};
        Arrays.sort(ar);
        System.out.println("Smallest digit on an array is: "+ar[0]);
        System.out.println("Largest digit on an array is: "+ar[ar.length-1]);

    }

}
