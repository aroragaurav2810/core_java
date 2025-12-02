package interview_preparation_array_and_string_coding_set3;

import java.util.Arrays;

public class ArmStrongNumberCheck
{

    // An Armstrong number (also known as a narcissistic number or plenary number) is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits in the number
    static void main() {

        int number=1634;
        System.out.println("Number is "+number);
        String number_in_string_format=String.valueOf(number);
        int ar[]=new int[number_in_string_format.length()];
        for(int i=0;i<number_in_string_format.length();i++)
        {
            ar[i]=number_in_string_format.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(ar));
        int new_number=0;
        for(int i=0;i<ar.length;i++)
        {
            int temp=1;
            for(int j=0;j<ar.length;j++)
            {
                temp=temp*ar[i];

            }
            new_number=new_number+temp;
        }
        System.out.println("New Number is "+new_number);
        if(number==new_number)
        {
            System.out.println("Number is armstrong number");
        }
        else
        {
            System.out.println("Number is not an armstrong number");
        }
    }

}
