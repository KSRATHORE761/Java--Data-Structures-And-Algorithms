public class RemoveCharFromString {
    public static void main(String[] args) {
        String str="baccdahaaabc";
        System.out.println(removeChar(str));
        // StringBuilder sb = new StringBuilder();
        // System.out.println(removeChar(str, sb, 0));
    }
    // public static String removeChar(String str,StringBuilder sb,int i){
    //     char ch = 'a';
    //     if(i==str.length()){
    //         return sb.toString();
    //     }
    //     if(str.charAt(i)!=ch){
    //         sb.append(str.charAt(i));
    //     }
    //     return removeChar(str,sb,i+1);
    // }

    public static String removeChar(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return removeChar(str.substring(1));
        }
        else{
            return ch+removeChar(str.substring(1));
        }
    }
}
