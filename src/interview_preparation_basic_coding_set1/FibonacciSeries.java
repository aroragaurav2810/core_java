package interview_preparation_basic_coding_set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries
{


    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number until which you want to see the fibonacci series");
        int series_count_number=sc.nextInt();
        int first_number=0;
        int second_number=1;
        List<Integer> fibnoacciNumbersList=new ArrayList<>();
        fibnoacciNumbersList.add(first_number);
        fibnoacciNumbersList.add(second_number);
        int sum=0;
        for(int i=2;i<=series_count_number;i++)
        {
            sum=first_number+second_number;
            fibnoacciNumbersList.add(sum);
            first_number=second_number;
            second_number=sum;

        }
        System.out.println(fibnoacciNumbersList);

    }

}


