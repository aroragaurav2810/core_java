package interview_preparation_oops_and_core_java_coding_set4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWordsInParagraphUsingHashMap
{

    static void main(){

        String paragraph="Hi I am Gaurav Arora, I know java core and I know some questions of java DSA, If you have any questions please let gaurav arora knows";
        String replaceRegularExpression=paragraph.replaceAll(("[^A-Za-z0-9 ]"),"");
        String ar[]=replaceRegularExpression.split("\\s");
        System.out.println(replaceRegularExpression);
        System.out.println(Arrays.toString(ar));
        Map<String, Integer> wordsCountMap=new HashMap<>();
        for(String temp:ar)
        {
            String str=temp.toLowerCase();
            if(wordsCountMap.containsKey(str))
            {
             wordsCountMap.put(str,wordsCountMap.get(str)+1);
            }
            else {
                wordsCountMap.put(str, 1);
            }

        }
        System.out.println("Map is "+wordsCountMap);

    }

}
