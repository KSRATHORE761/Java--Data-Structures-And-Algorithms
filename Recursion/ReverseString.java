public class ReverseString {
    public static void main(String[] args) {
        char ch[] = {'h','e','l','l','o'};
        int start = 0;
        int end = ch.length-1;
        reverse(ch, start, end);
        System.out.println(String.valueOf(ch));
    }   
    public static void reverse(char[] ch, int s,int e){
        if(s>=e){
            return;
        }
        swap(ch, s, e);
        reverse(ch, s+1, e-1);
    }
    public static void swap(char[] ch, int s,int e){
        char temp = ch[s];
        ch[s] =ch[e];
        ch[e] = temp;
    }
}
