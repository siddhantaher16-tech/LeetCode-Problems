class Solution {
    public char findTheDifference(String s, String t) {
        byte[] arr = new byte[26];

        for(char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }

        for(char ch : t.toCharArray()) {
            arr[ch-'a']--;
        }

        for(byte i=0; i<arr.length; i++) {
            if(arr[i]==-1) return (char)(i+'a');
        }

        return 'a';
    }
}