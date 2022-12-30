/*Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1. */

//https://leetcode.com/problems/next-greater-element-iii/
//https://leetcode.com/problems/next-greater-element-iii/discuss/101824/Simple-Java-solution-(4ms)-with-explanation.
public class NextGreaterElementIII {
    public static void main(String[] args){
        int n =534976;
        System.out.println("Next Greater Element is : "+nextGreaterElement(n));
    }
    public static int nextGreaterElement(int number) {
        char[] digit = String.valueOf(number).toCharArray();
        int n= digit.length;
        int index1=-1;
        int index2=-1;
        for(int i=n-1;i>0;i--){
            if(digit[i] - '0' > digit[i-1] - '0'){
                index1=i-1;
                break;
            }
        }
        if(index1==-1){
            return -1;
        }
        for(int i=n-1;i>index1;i--){
            if(digit[i] - '0' > digit[index1] - '0'){
                index2=i;
                break;
            }
        }
        swap(digit,index1,index2);
        reverse(digit,index1+1,n-1);
        long val = Long.parseLong(new String(digit));
        return (val<=Integer.MAX_VALUE) ? (int)val : -1;
    }
    public static void swap(char[] digit, int i, int j){
        char temp =digit[i];
        digit[i] = digit[j];
        digit[j]= temp;
    }
    public static void reverse(char[] digit,int start, int end){
        if(start>=end){
            return;
        }
        for(int i =start;i<= (start + end)/2;i++){
            swap(digit,i,start + end -i);
        }
    }
}
