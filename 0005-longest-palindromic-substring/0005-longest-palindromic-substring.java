class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String largest="";
        if(s.length()==1) return s;

        for(int i=0;i<s.length()-1;i++){
            String str1="";
        
           for (int j = i + max; j <= s.length(); j++) {
                if (j - i > max && isPalindrome(s.substring(i, j))) {
                    max = j - i;
                    largest = s.substring(i, j);
                }
            }
        }
        return largest;
    }

    public boolean isPalindrome(String str){
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if(!(str.charAt(i)==str.charAt(j)))
                return false;
        }
        return true;
    }
}