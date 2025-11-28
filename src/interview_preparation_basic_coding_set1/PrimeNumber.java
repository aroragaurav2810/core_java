package interview_preparation_basic_coding_set1;

import java.util.Scanner;

public class PrimeNumber
{

    static void main() {
        Scanner sc=new Scanner(System.in);
        while (true) {
            boolean isPrime=true;
            System.out.println("Enter a number to check whether it is prime or not");
            int number = sc.nextInt();
            if(number==1)
            {
                isPrime=false;
            }
            if(number==2)
            {
                isPrime=true;
            }
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }

        }
    }

}
