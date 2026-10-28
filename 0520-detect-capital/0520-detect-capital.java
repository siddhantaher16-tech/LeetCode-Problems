class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<=1) return true;
        if(!Character.isUpperCase(word.charAt(0))){
            for(char ch : word.toCharArray()){
                if(Character.isUpperCase(ch)) return false;
            }
        } else{
            if(!Character.isUpperCase(word.charAt(1))) 
                for(int i=2; i<word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))) return false;}
            else
                for(int j=2; j<word.length(); j++){
                    if(!Character.isUpperCase(word.charAt(j))) return false;} 
        }
        return true;
    }
}