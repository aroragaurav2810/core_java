package interview_preparation_number_and_math_coding_set3;

import java.util.Arrays;

public class DigitalRoot

{
    // 999999999999999999999999999999999 = 9+9+9+9+9+9+9+9+9+9+9+9 = 108
    // 108 = 1+0+8 = 9

    // So, Digital root of 9999 is 9

    static void main() {
        int number= 999999999;
        String number_in_string_format=String.valueOf(number);
        int number_array[]=new int[number_in_string_format.length()];
        for(int i=0;i<number_in_string_format.length();i++)
        {
            number_array[i]=number_in_string_format.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(number_array));
        int sum;
        do {
            sum=0;
            for (int i = 0; i < number_array.length; i++) {
                sum = sum + number_array[i];
            }
            String new_number_in_string_format=String.valueOf(sum);
            number_array=new int[new_number_in_string_format.length()];
            for(int i=0;i<new_number_in_string_format.length();i++)
            {
                number_array[i]=new_number_in_string_format.charAt(i)-'0';
            }
        }while(sum>=10);
        System.out.println("Digital root is "+sum);
    }

}
