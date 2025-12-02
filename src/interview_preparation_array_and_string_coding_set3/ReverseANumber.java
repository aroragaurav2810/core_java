package interview_preparation_array_and_string_coding_set3;

public class ReverseANumber
{


    public ReverseANumber() {
    }

    static void main() {

        int number=125;

        /*
        String number_in_string_format=String.valueOf(number);
        StringBuilder sb=new StringBuilder(number_in_string_format);
        System.out.println(sb.reverse());
        */

        // or
        int dividend=number;
        int quotient;
        int remainder;
        int reverse_number=0;
        do
        {
            quotient=dividend/10;       //      12 , 1
            remainder=dividend%10;      //      5, 2
            dividend=quotient;
            reverse_number=reverse_number*10+remainder;  // 0*10+5 = 5, 5*10+2= 52 , 52*10+1=521
        }while(quotient>0);
        System.out.println(reverse_number);
    }


}
