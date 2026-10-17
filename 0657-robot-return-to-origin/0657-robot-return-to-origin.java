class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2!=0) return false;
        
        int x=0, y=0;
        for( char ch : moves.toCharArray()){
            if(ch=='L') x++;
            else if(ch=='R') x--;
            else if(ch=='U') y++;
            else y--;
        }

        return x==0 && y==0;


        // ArrayList<Character> list = new ArrayList<>();

        // for(int i=0; i<moves.length(); i++){
        //     list.add(moves.charAt(i));
        // }

        // outer:
        // for(int i=0; i<list.size(); i++){
        //     char ch = list.get(i);
        //     for(int j=list.indexOf(ch)+1; j<list.size(); j++){
        //         if((ch=='L' && list.get(j)=='R') ){
        //             list.remove(i--);
        //             list.remove(j-1);
        //             continue outer;
        //         }
        //         if((ch=='R' && list.get(j)=='L') ){
        //             list.remove(i--);
        //             list.remove(j-1);
        //             continue outer;
        //         }
        //         if((ch=='D' && list.get(j)=='U') ){
        //             list.remove(i--);
        //             list.remove(j-1);
        //             continue outer;
        //         }
        //         if(ch=='U' && list.get(j)=='D'){
        //             list.remove(i--);
        //             list.remove(j-1);
        //             continue outer;
        //         }
        //     }
        // }

        // return list.isEmpty();
    }
}