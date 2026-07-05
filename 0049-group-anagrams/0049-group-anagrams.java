class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> map = new HashMap<>();

        // for(String str : strs){
        //     char[] arr = str.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);
        //     if(!map.containsKey(key)){
        //         map.put(key, new ArrayList<String>());
        //     }
        //     map.get(key).add(str);
        // }

        // return new ArrayList<List<String>>(map.values());
        

        List<List<String>> list = new ArrayList<List<String>>();
        boolean[] boo = new boolean[strs.length];
        
        if(strs.length==0) return new ArrayList<>();
        // if(strs.length==1) return new ArrayList<>(new ArrayList<>(strs[0));
        
        for(int i=0; i<strs.length; i++){
            if(boo[i]) continue;
            List<String> set = new ArrayList<String>();
            set.add(strs[i]);
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            outer:
            for(int j=i+1; j<strs.length; j++){
                if(boo[j]) continue;
                char[] ch0 = strs[j].toCharArray();
                if(ch.length!=ch0.length) continue;
                Arrays.sort(ch0);
                for(int k=0; k<ch.length; k++)
                    if(ch[k]!=ch0[k]) continue outer;
                set.add(strs[j]);
                boo[j]=true;
            }
            list.add(set);
        }
        return list;
    }
}