package interview_preparation_arrays_and_string_coding_set2;

import java.util.Arrays;

public class AnagramStringCheck
{
    // listen and silent are anagram strings
    static void main() {
        String str1="care";
        String str2="race";
        if(str1.length()!=str2.length())
        {
            System.out.println("Not anagram strings");
            System.exit(0);
        }
        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        str1=Arrays.toString(ar1);
        str2=Arrays.toString(ar2);
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Anagram Strings");
        }
        else
        {
            System.out.println("Not anagram strings");
        }
    }

}
