package interview_preparation_arrays_and_string_coding_set2;

public class MissingNumberInArrayOfDefinedPattern
{


    static void main() {
        int ar[]=new int[]{5,10,15,20,25,30,35,40,45,50,55,60,70,75,80};
        int first_number=ar[0];
        int last_number=ar[ar.length-1];
        int array_size=ar.length;
        int expected_difference=(last_number-first_number)/array_size;
        System.out.println("Expected difference is: "+expected_difference);
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]-ar[i-1]!=expected_difference)
            {
                int missing_number=ar[i]-expected_difference;
                System.out.println("Missing number in an array is: "+ missing_number);
            }
        }

    }

}
