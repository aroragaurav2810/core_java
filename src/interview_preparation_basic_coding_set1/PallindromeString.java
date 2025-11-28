package interview_preparation_basic_coding_set1;

import java.util.Scanner;

public class PallindromeString

{


    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string to check whether it is pallindrome or not or enter 'exit' to come out of the program");
            String str1 = sc.next();
            switch (str1)
            {
                case "exit":
                    System.exit(0);
            }
            String str2 = "";
            for (int i = str1.length() - 1; i >= 0; i--) {
                str2 = str2 + str1.charAt(i);
            }
            if (str1.equalsIgnoreCase(str2)) {
                System.out.println("string is pallindrome");
            } else {
                System.out.println("String is not pallindrome");
            }
        }
    }
}
