package interview_preparation_basic_coding_set1;

import java.util.Arrays;

public class SmallestAndLargestDigitOfArray {


    static void main() {
        int ar[] = new int[]{20, 10, 30, 90, 40, 50, 100, 60, 70, 5, 80};
        int smallest_element=ar[0];
        int largest_element=ar[ar.length-1];
        for(int i=0;i<ar.length;i++) {
            if (smallest_element > ar[i]) {
                smallest_element = ar[i];
            }
            if (largest_element < ar[i]) {
                largest_element = ar[i];
            }
        }
        System.out.println("Smallest element is: "+smallest_element);
        System.out.println("Largest element is: "+largest_element);
    }
}
