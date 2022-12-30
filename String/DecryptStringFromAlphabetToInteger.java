public class DecryptStringFromAlphabetToInteger {
    public static void main(String[] args){
        String s = "1326#";
        System.out.println(Decrypt(s));
    }
    public static String Decrypt(String s){
        StringBuilder sb = new StringBuilder();
        char[] bucket = new char[26];
        for(char ch = 'a'; ch<='z';ch++){
            bucket[ch-'a'] = ch;
        }
        for(int i = 0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                sb.append(bucket[Integer.valueOf(s.substring(i,i+2))-1]);
                i +=2;
            }
            else{
                sb.append(bucket[Integer.valueOf(String.valueOf(s.charAt(i)))-1]);
            }
        }

        return sb.toString();

    } 
}
