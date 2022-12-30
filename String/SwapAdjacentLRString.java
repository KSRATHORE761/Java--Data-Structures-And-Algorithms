public class SwapAdjacentLRString {
    public static void main(String[] args) {
        String start = "XXXXXLXXXX", end ="LXXXXXXXXX";
        System.out.println(canTransform(start,end));

    }
    public static boolean canTransform(String start, String end) {
        int i=0,j=0,n=start.length();
        while(i<n && j<n){
            if(start.charAt(i)==end.charAt(j)){
                i++;
                j++;
            }
            else{
                if((i+1<n && start.substring(i,i+2).equals("XL")) || (j+1<n && end.substring(j,j+2).equals("XL")) ){
                    start=swap(start,i,i+1);
                    if(start.substring(i,i+2).equals(end.substring(j,j+2))){
                        i +=2;
                        j +=2;
                    }
                    else{
                        return false;
                    }
                }
                else if(i+1<n && start.substring(i,i+2).equals("RX")){
                    start=swap(start,i,i+1);
                    if(start.substring(i,i+2).equals(end.substring(j,j+2))){
                        i +=2;
                        j +=2;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static String swap(String s, int  start, int end){
        char[] c = s.toCharArray();
        char temp = c[start];
        c[start]=c[end];
        c[end]=temp;
       return new String(c);
    }
}
