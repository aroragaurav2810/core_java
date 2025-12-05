package interview_preparation_arrays_and_string_coding_set2;

import java.util.Arrays;

public class RotataArrayByKSteps
{

    static void main() {
        int ar[]=new int[]{10,20,30,40,50,60,70,80,90,100};
        int rotateBy=3;
        for(int i=0;i<rotateBy;i++)
        {
            int temp=ar[0];
            System.out.println(temp);
            for(int j=1;j<ar.length;j++)
            {
                ar[j-1]=ar[j];
            }
            ar[ar.length-1]=temp;
            System.out.println(Arrays.toString(ar));
        }
    }

}
