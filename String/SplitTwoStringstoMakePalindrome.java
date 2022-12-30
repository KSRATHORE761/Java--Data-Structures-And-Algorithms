public class SplitTwoStringstoMakePalindrome {
    public static void main(String[] args) {
        String a="xbdef";
        String b="xecab";
        System.out.println("Is it a palindrome formation: "+checkPalindromeFormation(a, b));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    static boolean check(String a, String b){
        int i=0;
        int j= b.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j)){
            i++;
            j--;
        }
        return isPalindorme(a,i,j) || isPalindorme(b,i,j);
    }
    static boolean isPalindorme(String s,int i, int j){
        while(i<j && s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        return i>=j;
    }
}
