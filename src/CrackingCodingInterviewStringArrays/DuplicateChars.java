package CrackingCodingInterviewStringArrays;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateChars {
    /*
        Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method.
     */
    public static void main(String[] args) {
        String s1 = "deepti";
        System.out.println(removeDups(s1));
    }
    public static String removeDups(String s) {
        HashSet<Character> hs = new HashSet<>();
        if (s.isEmpty() || s.isBlank() ) return "";

        char[] arr = s.trim().toLowerCase().toCharArray();
        System.out.println(Arrays.toString(arr));

        int tail = 1;hs.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(!hs.contains(arr[i])) {
                arr[tail] = arr[i];
                tail++;
                hs.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tail; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();

    }
}
