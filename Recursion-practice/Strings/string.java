package Strings;

public class string {
    public static void main(String[] args) {
//        skip("","bacaacd");
//        System.out.println(skip("bdcaaaaaaksk"));
        System.out.println(skipApple("bdcaaaappleaaksk"));
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
    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0)+ skipApple(str.substring(1));
        }
    }

    static String skipApp(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipApple(str.substring(3));
        } else {
            return str.charAt(0)+ skipApple(str.substring(1));
        }
    }

}
