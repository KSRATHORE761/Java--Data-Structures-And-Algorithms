import java.util.HashSet;

public class StringHalfsAreAlike {
    public static void main(String[] args) {
        String str = "textbook";
        System.out.println("String Halves are alike: "+halvesAreAlike(str));
    }
    public static boolean halvesAreAlike(String s) {
        HashSet<String> set = new HashSet<>();
        for(char ch : "aeiouAEIOU".toCharArray()){
            set.add(String.valueOf(ch));
        }
        int count1=0,count2=0;
        int i=0,j=s.length()/2;
        while(i<s.length()/2 && j<s.length()){
            if(set.contains(String.valueOf(s.charAt(i)))){
                count1++;
            }
            if(set.contains(String.valueOf(s.charAt(j)))){
                count2++;
            }
            i++;
            j++;
        }
        return count1==count2;
    }
}
