public class LengthOfStringUsingRecursion {
    public static void main(String[] args) {
        String str = "geeKs";
        System.out.println(findingLengthOfString(str, 0));
    }
    public static int findingLengthOfString(String str,int i){
        try{
            char ch = str.charAt(i);
            return findingLengthOfString(str,i+1);
        }
        catch(IndexOutOfBoundsException e){
            return i;
        }
    }
}
