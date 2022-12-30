public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args){
     char[] letters =   {'c','f','j'};
     char target = 'd';
     System.out.println(nextGreatestLetter(letters,target));
    }
    /** 
    Given a characters array letters that is sorted in non-decreasing order and a character target, 
    return the smallest character in the array that is larger than target. 

    Note that the letters wrap around.

    For example, if target == 'z' 
    and letters == ['a', 'b'], the answer is 'a'.

    **/
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
