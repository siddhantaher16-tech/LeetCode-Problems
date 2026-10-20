class Solution {
    public int countSegments(String s) {
        if(s.length()==0) return 0;
        // int space =  1;
        // for(int i=1; i<s.length(); i++){
        //     if(s.charAt(i-1)==' ' && s.charAt(i)!=' ') space++;
        // }
        int count = 0;
        String[] arr = s.split(" ");
        for(String ele : arr){
            if(ele.length()>=1) count++;
        }
        return count;
    }
}