package interview_preparation_array_and_string_coding_set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNonRepeatedCharacter

{

    static void main() {
        String str = "arora arora";
        str = str.replace(" ", "");
        List<Character> repeated_character_list = new ArrayList<>();
        System.out.println(str);
        boolean repeated_character=false;
        for (int i = 0; i < str.length(); i++) {
            repeated_character = false;
            if (!repeated_character_list.contains(str.charAt(i))) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        repeated_character = true;
                        repeated_character_list.add(str.charAt(i));
                        break;
                    }
                }
                if (!repeated_character) {
                    System.out.println("First non repeated character is " + str.charAt(i));
                   System.exit(0);
                }
            }
        }
        if (!repeated_character)
        {
            System.out.println("No non repeated character");
        }
    }

}
