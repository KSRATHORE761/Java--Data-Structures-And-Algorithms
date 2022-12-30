/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, 
return true if sentence is a pangram, or false otherwise.
 */

 // https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckSentenceIsPangram {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Sentance is Pangram : " + checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        // Set<Character> set = new HashSet<>();
        // for(int i =0;i<sentence.length();i++){
        //     set.add(sentence.charAt(i));
        // }
        // if(set.size()==26){
        //     return true;
        // }
        // return false;
        boolean[] letters = new boolean[26];
        for(char c : sentence.toCharArray()){
            letters[c - 'a'] = true;
        }
        //   check character exists or not
        for(boolean leterExists : letters){
            if(!leterExists){
                return false;
            }
        }
        return true;
    }
}
