package interview_preparation_basic_coding_set1;

import java.util.Scanner;

public class FactorialNumber

{

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number whose factorial you want to compute: ");
        int number=sc.nextInt();
        int factorial=1;
        while(number>0)
        {
            factorial=factorial*number;
            number--;
        }
        System.out.println("Factorial of number is: "+factorial);

    }

}
