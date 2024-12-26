package algo.string;

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
}
