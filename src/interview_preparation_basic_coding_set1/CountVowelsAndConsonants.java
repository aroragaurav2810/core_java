package interview_preparation_basic_coding_set1;

public class CountVowelsAndConsonants
{


    static void main(String[] args) {

            String str="gaurav arora";
            String vowels="aeiou";
            int vowelscount=0;
            int consonantscount=0;
            for(int i=0;i<str.length();i++)
            {
                if(vowels.contains(str.charAt(i)+""))
                {
                    vowelscount++;
                }
                else
                {
                    consonantscount++;
                }
            }
            System.out.println("Vowels count is "+vowelscount);
            System.out.println("Consonants count is "+consonantscount);


    }

}
