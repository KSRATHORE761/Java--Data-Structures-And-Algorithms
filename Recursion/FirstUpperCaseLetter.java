public class FirstUpperCaseLetter {
    public static void main(String[] args) {
        String str = "geeKs"; 
        char ch=  isUpperCaseLetter(str, 0);
        if(ch==0){
            System.out.println("There is no uppercase letter in given string");
        } 
        else{
            System.out.println("Uppercase letter in given string is: "+ch);
        }
    }
    public static char isUpperCaseLetter(String str, int i){
        if(i==str.length()){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return isUpperCaseLetter(str, i+1);
    }

}
