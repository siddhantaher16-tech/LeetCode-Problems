class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                    if(i+map.get(list2[i])==min) list.add(list2[i]);
                    else if(i+map.get(list2[i])<min) {
                        list.clear();
                        list.add(list2[i]);
                        min=i+map.get(list2[i]);
                    }


        // for(int i=0; i<list1.length; i++){
        //     String str = list1[i];
        //     for(int j=0; j<list2.length; j++){
        //         if(list2[j].equals(str)){
        //             if(i+j==min) list.add(str);
        //             else if(i+j<min) {
        //                 list.clear();
        //                 list.add(str);
        //                 min=i+j;
        //             }
        //             else continue;
            }
        }
        return list.toArray(new String[0]);
    }
}