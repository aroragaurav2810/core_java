package interview_preparation_arrays_and_string_coding_set2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter

{

    static void main() {
        String str="hhhhhhhijklmnoabcdefghhhhhhhijklmno";
        Set<String> subStringSet=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            String subString=str.charAt(i)+"";
            for(int j=i+1;j<str.length();j++)
            {
                if(subString.charAt(subString.length()-1)!=str.charAt(j))
                {
                        subString=subString+str.charAt(j);
                        i++;
                }
                else
                {
                    break;
                }

            }
            subStringSet.add(subString);
        }
        System.out.println("Substring set is: "+subStringSet);
        String longestString=subStringSet.iterator().next();
        for(String temp:subStringSet)
        {
            if(temp.length()>longestString.length())
            {
                longestString=temp;
            }
        }
        System.out.println("Longest string is: "+longestString);

    }

}
