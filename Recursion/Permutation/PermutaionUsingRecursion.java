import java.io.Console;
import java.util.ArrayList;

public class PermutaionUsingRecursion{
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(permutationList("","abc"));
    }
    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first+ch+second,up.substring(1));
        }
    }
    // This function will return the arraylist;
    public static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> lst = new ArrayList<>();
           lst.add(p);
           return lst;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationList(first+ch+second,up.substring(1)));
        }
        return ans;
    }
}