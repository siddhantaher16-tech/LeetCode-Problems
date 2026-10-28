class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        if(b.length()>a.length()) return b.length();
        else return a.length();
    }
}