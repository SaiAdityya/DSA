class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        for(int i = 0;i < m;i++){
            String temp = "";
            for(int j = 0;j < n;j++){
                if(i == m - 1){
                    temp = temp + ".";
                    continue;
                }
                if(j == 0){
                    temp = temp + ".";
                    continue;
                }
                temp = temp + "#";
            }
            ans[i] = temp;
        }
        return ans;
    }
}