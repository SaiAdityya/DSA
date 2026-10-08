class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] input = s.toCharArray();
        int n = s.length();
        reverse(input,0,n - 1);
        int start = 0;
        while(start < n){
            int end = start;
            while(end < input.length - 1 && input[end + 1] != ' '){
                end++;
            }
            reverse(input,start,end);
            start = end + 2;
        }
        return String.valueOf(input);
    }
    public static void reverse(char[] arr,int l,int r){
        while(l <= r){
            char t;
            t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
            l++;
            r--;
        }
    }
}