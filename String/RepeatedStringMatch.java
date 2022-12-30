public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a="aa";
        String b="a";
        int z = 2147483647;
        //System.out.println(repeatedStringMatch(a, b));

    }
    public static int repeatedStringMatch(String a, String b) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        if(sb.toString().contains(b)){
            return count++;
        }
        if(sb.append(a).toString().contains(b)){
            return count++;
        }
        return -1;
    }
}
