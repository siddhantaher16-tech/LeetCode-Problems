class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     if(s.length()<=1) return s.length();
    //     int max=0;
    //     String largest="";

    //     for(int i=0;i<s.length()-1;i++){
    //         String str=s.charAt(i)+"";
    //         if(isUnique(str))
    //             if(str.length()>max){
    //                 max=str.length();
    //                 largest=str;
    //             }
    //         for(int j=i+1;j<s.length();j++){
    //             str+=s.charAt(j);
    //             if(isUnique(str))
    //                 if(str.length()>max){
    //                     max=str.length();
    //                     largest=str;
    //                 }
    //         }
    //     }
    //     return max;
    // }

    // public boolean isUnique(String str){
    //     for(int i=0;i<str.length()-1;i++)
    //         for(int j=i+1;j<str.length();j++)
    //             if(str.charAt(i)==str.charAt(j))
    //                 return false;
    //     return true;

        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;   
    }
}