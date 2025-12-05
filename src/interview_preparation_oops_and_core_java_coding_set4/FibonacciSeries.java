package interview_preparation_oops_and_core_java_coding_set4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries

{

    static void main() {
        int first_number=0;
        int second_number=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number until which you need the fibonacci series");
        int number=sc.nextInt();
        List<Integer> fibonacciSeries=new ArrayList<>();
        fibonacciSeries.add(first_number);
        fibonacciSeries.add(second_number);
        int sum=0;
        for(int i=2;i<number;i++)
        {

            sum=first_number+second_number;
            first_number=second_number;
            second_number=sum;
            fibonacciSeries.add(sum);
        }
        System.out.println(fibonacciSeries);
    }

}
