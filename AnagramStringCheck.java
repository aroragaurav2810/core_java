class AnagramStringCheck
  {
    // Anagram String: An anagram string is a string which is made up of same characters
    // Examples: listen <-> silent , care <-> race , pat <-> tap , 12345 <-> 54321
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string 1 to check whether it is an anagram to string 2 or not, Enter exit to come out of the program");
            String str1 = sc.next();
            switch (str1)
            {
                case "exit":
                    System.exit(0);
            }
            System.out.println("Enter string 2 to check whether it is an anagram to string 1 or not, Enter exit to come out of the program");
            String str2 = sc.next();
            switch(str2)
            {
                case "exit":
                    System.exit(0);
            }
            char arr1[] = str1.toCharArray();
            Arrays.sort(arr1);
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr2);
            str1 = String.valueOf(arr1);
            str2 = String.valueOf(arr2);
            System.out.println(str1);
            System.out.println(str2);
            if (str1.equals(str2)) {
                System.out.println("Both strings are anagram strings");
            } else {
                System.out.println("Both strings are not anagram strings");
            }
        }
    }
}
