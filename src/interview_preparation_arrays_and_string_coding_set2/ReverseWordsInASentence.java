package interview_preparation_arrays_and_string_coding_set2;

public class ReverseWordsInASentence

{

    static void main() {
        String sentence="Hi this is Gaurav Arora";
        String ar[]=sentence.split("\\s");
        String reverse_sentence="";
        System.out.println("Original sentence is: "+sentence);
        for(int i=0;i<ar.length;i++)
        {
            String subString="";
            for(int j=ar[i].length()-1;j>=0;j--)
            {
                subString=subString+ar[i].charAt(j);
            }
            reverse_sentence=reverse_sentence+subString+" ";

        }
        System.out.println("Reverse sentence is: "+reverse_sentence);

    }

}
