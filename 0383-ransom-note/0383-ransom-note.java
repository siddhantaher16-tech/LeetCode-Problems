class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] mag = new int[26];
        for(int i=0; i<magazine.length(); i++){
            mag[(magazine.charAt(i)-'a')]++;
        }

        int[] rn = new int[26];
        for(int i=0; i<ransomNote.length(); i++){
            rn[(ransomNote.charAt(i)-'a')]++;
        }

        for(int i=0; i<rn.length; i++){
            if(rn[i]>mag[i]) return false;
        }
        return true;
    }
}