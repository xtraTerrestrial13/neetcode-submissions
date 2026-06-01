class Solution {
   
  
   public boolean addToSet(Map<String, Set<Integer>> map, String key,char ch){
        Set<Integer> set = new HashSet<>();
        if(map.containsKey(key)){
           set=map.get(key);
        }

        if(!validNumber(ch) || set.contains((int) ch)){
            return false;
        }
        set.add((int) ch);
        map.putIfAbsent(key,set);
       return true;
    }

    public String key (int row, int col){
        return row + "_" + col;
    }

    public boolean validNumber(char ch){
        return ch >= '0' && ch <= '9';
    }

    public String getSquareKey (int row, int col){

        return "sq_"+ ((row/3) + 1) + "_"+ ((col/3) + 1);
    }
    public boolean isValidSudoku(char[][] board) {


/*
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]
 */

        Map<String, Set<Integer>> counterMap= new HashMap<>();

        for(int i =0 ; i<board.length ; i++){
            for(int j = 0; j<board.length;j++){
                char c = board[i][j];
                if(c=='.'){
                    continue;
                }
                String rowKey = key(i,10);
                String columnKey= key(10,j);
                String getSquareKey = getSquareKey(i,j);
                if( !addToSet(counterMap,getSquareKey,c) || ! addToSet(counterMap,rowKey,c) || !addToSet(counterMap,columnKey,c)){
                return false;
                }
            }
        }
        return true;
    }


}
