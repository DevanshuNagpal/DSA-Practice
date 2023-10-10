package Strings;

public class subsequences {
    public static void main(String[] args) {
//        skip("","bacaacd");
        System.out.println(skip("bdcaaaaaaksk"));
    }
//    Skip a character

        static void skip(String ans,String str){
            if(str.isEmpty()){
                System.out.println(ans);
                return ;
            }

            char ch = str.charAt(0);
            if(ch=='a'){
                skip(ans,str.substring(1));
            }
            else{
                skip(ans+ch,str.substring(1));
            }

        }

    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }


    }
}
