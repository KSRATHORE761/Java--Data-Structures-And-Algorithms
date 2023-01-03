import java.util.ArrayList;

public class LetterCombinationPhoneNo{
    public static void main(String[] args) {
        //System.out.println(getCombinationsOfLetter("","12"));
        getCombinationsOfLetter("","67");
    }
    static void getCombinationsOfLetter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = (up.charAt(0) - '0'); // This will convert '2' to 2.
        for(int i= (digit -1)*3;i<digit*3;i++){
            char ch = (char)('a'+ i);
            getCombinationsOfLetter(p+ch,up.substring(1));
        }
    }
    // static ArrayList<String> getCombinationsOfLetter(String p, String up){
    //     if(up.isEmpty()){
    //         ArrayList<String> lst = new ArrayList<>();
    //         lst.add(p);
    //         return lst;
    //     }
    //     int digit = up.charAt(0) - '0'; // This will convert '2' to 2.
    //     ArrayList<String> list = new ArrayList<>();
    //     for(int i= (digit -1)*3;i<digit*3;i++){
    //         char ch = (char)('a'+ i);
    //         list.addAll((getCombinationsOfLetter(p+ch,up.substring(1))));
    //     }
    //     return list;
    // }
}