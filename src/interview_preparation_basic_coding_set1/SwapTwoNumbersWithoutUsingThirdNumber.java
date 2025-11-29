package interview_preparation_basic_coding_set1;

public class SwapTwoNumbersWithoutUsingThirdNumber

{


    static void main() {
        int first_number=10;
        int second_number=20;
        System.out.println("Before swap, First number is "+first_number);
        System.out.println("Before swap, Second number is "+second_number);
        first_number=first_number+second_number;
        second_number=first_number-second_number;
        first_number=first_number-second_number;
        System.out.println("After swap, First number is "+first_number);
        System.out.println("After swap, Second number is "+second_number);
    }


}
