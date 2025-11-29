package interview_preparation_basic_coding_set1;

import java.util.Scanner;

public class ReverseAString
{

    static void main() {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
        System.out.println("Enter a string to generate its reverse or enter 'exit' to exit the program");
        String str=sc.next();
        switch (str)
        {
            case "exit":
                System.exit(0);
        }
        String reverse_string="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse_string=reverse_string+str.charAt(i);
        }
        System.out.println("Reverse of string is: "+reverse_string);
    }
    }

}
