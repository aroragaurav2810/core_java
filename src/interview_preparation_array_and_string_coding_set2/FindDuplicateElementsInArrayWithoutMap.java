package interview_preparation_array_and_string_coding_set2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementsInArrayWithoutMap
{

    static void main() {
        int ar[]=new int[]{10,20,30,40,50,60,70,80,90,100,80,70};
        List<Integer> duplicate_elements_list=new ArrayList<>();
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    duplicate_elements_list.add(ar[i]);
                    break;
                }
            }
        }
        System.out.println("Duplicate elements in the array: "+duplicate_elements_list);
    }

}
