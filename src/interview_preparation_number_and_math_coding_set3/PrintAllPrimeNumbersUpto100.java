package interview_preparation_number_and_math_coding_set3;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrimeNumbersUpto100

{

    static void main() {
        List<Integer> primeNumberList=new ArrayList<>();
        for(int i=2;i<=100;i++)
        {
            boolean isPrime=true;
            for (int j=2; j<i; j++) {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime) {
                primeNumberList.add(i);
            }
        }
        System.out.println(primeNumberList);

    }

}
