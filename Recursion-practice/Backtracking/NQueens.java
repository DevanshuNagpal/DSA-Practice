package Backtracking;

public class NQueens {

    public static void main(String[] args) {
        int n =4;
        boolean[][] board  = new boolean[n][n];
//        queens(board,0);

        System.out.println(queens(board,0));
    }
    static  int queens(boolean[][] board,int row){
//       All the queens have been placed
        if(row == board.length){
            display(board);
            return 1;
        }

//        Placing the queen and checking for every row and column
        int count = 0;

        for(int col = 0;col<board.length;col++){
//            place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
//        Check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

//        Diagonal Left
        int maxLeft = Math.min(row,col);
        for(int i=1 ; i<=maxLeft ; i++){
            if(board[row - i][col - i] == true){
                return false;
            }
        }
            //        Diagonal right

        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1 ; i<=maxRight ; i++){
            if(board[row - i][col + i] == true){
                return false;
            }
        }
        return true;


    }
    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean ele:row){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
