class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check if the same 3x3 don't have a same number
        // check if the same row doesn't have a same number
        // check if the same col doesn't have a same number
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(!isValidCol(board,i,j,board[i][j]) || !isValidRow(board,i,j,board[i][j]) || !isValidGrid(board,i,j,board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidCol(char[][] board,int i,int j,char c){
        int n = board.length;
        for(int a=0;a<n;a++){
            if(a==i){
                continue;
            }
            if(board[a][j] == c){
                return false;
            }
        }
        return true;
    }
    public boolean isValidRow(char[][] board,int i,int j,char c){
        int n = board[0].length;
        for(int b=0;b<n;b++){
            if(b==j){
                continue;
            }
            if(board[i][b] == c){
                return false;
            }
        }
        return true;

    }
    public boolean isValidGrid(char[][] board,int i,int j,char c){
        int row_start = i - i%3;
        int col_start = j - j%3;
        for(int k=row_start;k<row_start+3;k++){
            for(int l=col_start;l<col_start+3;l++){
                if(k==i && l==j){
                    continue;
                }
                if(board[k][l] == c){
                    return false;
                }
            }
        }
        return true;
    }
}
