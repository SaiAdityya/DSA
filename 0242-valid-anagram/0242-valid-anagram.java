class Solution {
    public boolean isAnagram(String s, String t) {
       char[] char_1 = s.toCharArray();
       char[] char_2 = t.toCharArray();

       Arrays.sort(char_1);
       Arrays.sort(char_2);

       return Arrays.equals(char_1,char_2);
        
    }
}