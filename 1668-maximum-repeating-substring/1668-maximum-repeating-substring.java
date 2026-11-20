class Solution {
    public int maxRepeating(String seq, String word) {
        int count = 0;
        String temp = word;
        while(seq.contains(temp)){
            count++;
            temp += word;
        }
        return count;

    }
}