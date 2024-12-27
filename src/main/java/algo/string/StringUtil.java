package algo.string;

import java.util.Arrays;

public class StringUtil {
    private StringUtil(){}
    /**
     * Check if the string contains all unique characters in ASCII lists
     * @param str the given string
     * @return true if the string has all unique characters in ASCII lists
     */
    public static boolean containsUniqueCharacters(String str){
        //Create a boolean table whose size is the length of ASCII list (128 characters).
        //Using the ascii value of characters as the keys of the table.
        //iterate every character of the string and check in the table if the value in the position of
        //the key given by convert from character type to integer has value or not to find out if this
        //value already exists before.
        if(str.length() > 128) return false;
        boolean[] chars_set = new boolean[128];
        for(int i=0; i<str.length(); i++){
            int ascii_value = str.charAt(i);
            if(chars_set[ascii_value]){
                return false;
            }
            chars_set[ascii_value] = true;
        }
        return true;
    }

    /**
     *  Given two strings, write a method to decide if one is a permutation of the other.
     */
    public static boolean checkPermutation(String str1, String str2){
        int[] chars_set1 = new int[128];
        int[] chars_set2 = new int[128];
        for(int i=0; i<str1.length(); i++){
            int ascii_value = str1.charAt(i);
            chars_set1[ascii_value]++;
        }

        for(int i=0; i<str2.length(); i++){
            int ascii_value = str2.charAt(i);
            chars_set2[ascii_value]++;
        }
        if(Arrays.equals(chars_set1, chars_set2)) return true;
        else return false;

    }
}
