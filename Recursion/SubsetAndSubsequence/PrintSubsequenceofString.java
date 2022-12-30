import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubsequenceofString{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subseqeunce("", "abc").toArray()));
        subseqeuncePrint("","abc");
    }
    public static void subseqeuncePrint(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseqeunce(processed+ch,unprocessed.substring(1));
        subseqeunce(processed,unprocessed.substring(1));
    }
    public static ArrayList<String> subseqeunce(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(processed);
            return lst;
            
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left =subseqeunce(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = subseqeunce(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}