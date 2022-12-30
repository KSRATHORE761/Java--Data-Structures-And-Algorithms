import java.util.Arrays;
public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s={3};
        System.out.println(findNoofContentChilder(g,s));
    }
    public static int findNoofContentChilder(int[] g, int[] s){
        int i=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j =0;i<g.length && j<s.length;j++){
            if(g[i]<=s[j]){
                i++;
            }
        }
        return i;
    }
}
