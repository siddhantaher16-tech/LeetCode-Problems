class Solution {
    public String destCity(List<List<String>> paths) {
        String op = paths.get(0).get(1);
        String prev = op;
        for(int i=0; i<paths.size(); i++){
            prev=op;
            for(List<String> ele : paths){
                if(ele.get(0).equals(op)){
                    op=ele.get(1);
                }
            }
            if(prev.equals(op)) return op;
        }
        return op;
    }
}