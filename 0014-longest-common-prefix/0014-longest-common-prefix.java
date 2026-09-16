class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        //First Index and Last Index
        String prefix = "";
        int i = 0;
        Arrays.sort(strs); 
        while(i <= strs[0].length()){
            String first = strs[0];
            String last = strs[strs.length - 1];
            if(last.startsWith(first.substring(0,i))){
                prefix = first.substring(0,i);
                i++;
            }
            else{
                break;
            }
        }
        return prefix;
    }
}