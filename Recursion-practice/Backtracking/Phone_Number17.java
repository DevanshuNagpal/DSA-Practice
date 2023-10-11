package Backtracking;

import java.util.ArrayList;

public class Phone_Number17 {
    public static void main(String[] args) {
//        pad("","12");

//        Returning the arrayList
        System.out.println(padRet("","12"));
        System.out.println(padCount("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';  // This will convert '2' into 2

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
            
        }
    }

    static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';  // This will convert '2' into 2

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            count = count + padCount(p+ch,up.substring(1));

        }
        return count;
    }


    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';  // This will convert '2' into 2

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(padRet(p+ch,up.substring(1)));

        }
        return ans;
    }
}
