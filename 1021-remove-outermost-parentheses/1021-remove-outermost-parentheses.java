class Solution {
    public String removeOuterParentheses(String s) {
        char[] result = new char[s.length()];
        int index = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count > 0){
                    result[index++] = c;
                }
                count++;
            }else{
            count--;
                if(count > 0){
                    result[index++] = c;
                }

            }
        }
        return new String(result,0,index);
    }
}