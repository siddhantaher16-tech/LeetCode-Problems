class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] strArr = s.split(" ");

        Map<Character, String> map = new HashMap<>();

        if(strArr.length!=pattern.length()) 
            return false;
        
        int i=0;
        while(i<pattern.length()){
            char ch = pattern.charAt(i);

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(strArr[i]))
                    return false;
            }
            else{
                if(map.containsValue(strArr[i])) 
                    return false;
                map.put(ch,strArr[i]);
            }

            i++;
        }

        return true;
    }
}