public class MaximumRepeatingSubstring {
    public static void main(String[] args){
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println("Max Repeating Substring: "+ findMaxRepeatingSubstring(sequence,word));
    }
    public static int findMaxRepeatingSubstring(String sequence,String word){
        int count =0;
        int n = word.length();
        // System.out.println("Sequence is " +sequence + " and length is " + (sequence.length()) + " and count is " + (count));
        // while(sequence.length()>0){
        //     int index = sequence.indexOf(word);
        //     if(index==-1){
        //         return count;
        //     }
        //     else{
        //         sequence = sequence.substring(index+n,sequence.length());
        //         System.out.println("Sequence is " +sequence + " and length is " + (sequence.length()) + " and count is " + (count+1));
        //         count++;
        //     }
        // }
        for(int i =0;i<sequence.length();i++){
            int index = sequence.indexOf(word,i);
            if(index==-1){
                return count;
            }
            else{
                count++;
                i +=n-1;
            }
        }
        return count;
    }
}
