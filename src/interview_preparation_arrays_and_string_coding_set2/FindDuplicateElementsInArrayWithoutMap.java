package interview_preparation_arrays_and_string_coding_set2;

import java.util.*;

public class FindDuplicateElementsInArrayWithoutMap
{

    static void main() {
        int ar[]=new int[]{10,20,30,10,40,50,10,60,70,80,90,100,80,70};
        Set<Integer> duplicate_elements_set=new LinkedHashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    duplicate_elements_set.add(ar[i]);
                    break;
                }
            }
        }
        System.out.println("Duplicate elements in the array: "+duplicate_elements_set);
    }

}
