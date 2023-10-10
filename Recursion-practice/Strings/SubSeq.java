package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
    }

    static void subseq(String seq, String str) {
        if (str.isEmpty()) {
            System.out.println(seq);
            return;
        }
        char ch = str.charAt(0);
        subseq(seq + ch, str.substring(1));
        subseq(seq, str.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, str.substring(1));
        ArrayList<String> right = subseqRet(p, str.substring(1));

        left.addAll(right);
        return left;
    }
}