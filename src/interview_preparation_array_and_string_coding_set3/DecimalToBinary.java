package interview_preparation_array_and_string_coding_set3;

public class DecimalToBinary
{

    // Decimal to binary convert krne ke liye , you have to divide the number by 2 until the quotient remains 0
    // dividend    divisor    quotient    remainder
    // 13          2           6            1
    // 6           2           3            0
    // 3           2           1            1
    // 1           2           0            1

    static void main() {

            int decimal=15;
            int dividend=decimal;
            int quotient=0;
            int remainder=0;
            StringBuilder binary = new StringBuilder();
            do
            {
               quotient=dividend/2;      // 6    // 3      // 1      // 0
               remainder=dividend%2;     // 1    // 0      // 1      // 1
               dividend=quotient;
               binary=binary.append(remainder);
            }while(quotient>0);
        System.out.println("Decimal " +decimal+ " coversion to binary is: "+binary.reverse());
    }

}
