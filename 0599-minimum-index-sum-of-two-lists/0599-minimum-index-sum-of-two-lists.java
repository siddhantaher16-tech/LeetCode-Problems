class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        for(int i=0; i<list1.length; i++){
            String str = list1[i];
            for(int j=0; j<list2.length; j++){
                if(list2[j].equals(str)){
                    if(i+j==min) list.add(str);
                    else if(i+j<min) {
                        list.clear();
                        list.add(str);
                        min=i+j;
                    }
                    else continue;
                
                }
            }
        }

        String[] op = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            op[i]=list.get(i);
        }

        return op;



    }
}