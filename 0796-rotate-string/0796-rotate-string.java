class Solution {
    public boolean rotateString(String s, String goal) {
        char[] original = s.toCharArray();
        for(int i = 1;i<= original.length;i++){
            //Rotate Array
            char[] ans = rotate(original);
            if(String.valueOf(ans).equals(goal)){
                return true;
            }else{
                original = ans;
            }
        }
        return false;
    }
    public char[] rotate(char[] arr){
        char[] rotate_ans = new char[arr.length];
        for(int i = 0;i< arr.length;i++){
            rotate_ans[(i + 1) % arr.length] = arr[i];
        }
        return rotate_ans;
    }
}