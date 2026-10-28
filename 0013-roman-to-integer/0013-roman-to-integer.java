class Solution {
    public int romanToInt(String s){
        int ans = 0;
        for(int i = s.length() - 1; i >= 0;i--){
            int number = romanint(s.charAt(i));
            if(i > 0 && number > romanint(s.charAt(i - 1))){
                ans = ans + (number - romanint(s.charAt(i - 1)));
                i -= 1;
            }else{
                ans += romanint(s.charAt(i));
            }
        }
        return ans;
    }
    public int romanint(char c){
        switch (c){
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
        }
        return 0;
    }
}