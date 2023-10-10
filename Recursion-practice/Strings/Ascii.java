package Strings;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch+0);
////        This is because adding integer it will return integer and to get character cast it into char
//        System.out.println((char)(ch+0));

//        subseqAscii("","abc");

        System.out.println(subseqAsciiRet("","abc"));
    }
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }
    static ArrayList<String> subseqAsciiRet(String p, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, str.substring(1));
        ArrayList<String> second = subseqAsciiRet(p , str.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), str.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
