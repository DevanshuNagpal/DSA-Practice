package Backtracking;

import java.util.ArrayList;

public class Simple_Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathDia("",3,3));

        boolean[][] board = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};

//        pathRestrictions("" , board , 0,0);
        Backtrack("" , board , 0,0);

    }
    static int count(int r,int c)
    {
        if(r== 1 || c ==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;

    }


    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r >1){
            path(p+'D' ,r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list  =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r >1){
            ans.addAll(pathRet(p+'D' ,r-1,c));
        }
        if(c>1){
            ans.addAll(pathRet(p+'R',r,c-1));
        }
        return ans;
    }


    static ArrayList<String> pathDia(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list  =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r >1 && c>1){
            ans.addAll(pathRet(p+'d',r-1,c-1));
        }
        if(r >1){
            ans.addAll(pathRet(p+'D' ,r-1,c));
        }
        if(c>1){
            ans.addAll(pathRet(p+'R',r,c-1));
        }
        return ans;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }


        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }

    static void Backtrack(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

//        I am considering this block in my path mark false
        maze[r][c] = false;

        if (r < maze.length - 1) {
            Backtrack(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            Backtrack(p + 'R', maze, r, c + 1);
        }
        if (r>0) {
            Backtrack(p + 'U', maze, r-1, c );
        }
        if (c >0) {
            Backtrack(p + 'L', maze, r, c-1);
        }

//        This line is where  the function will be over
//        So before  the function gets removed  also remove the change made to the block

        maze[r][c] = true;

    }


}
