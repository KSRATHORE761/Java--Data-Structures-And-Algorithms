import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(findIntersectionofTwoArraysII(num1,num2)));
    }
    static int[] findIntersectionofTwoArraysII(int[] n1, int[] n2){
        Arrays.sort(n1);
        Arrays.sort(n2);
        int top=0,bottom=0;
        List<Integer> lst = new ArrayList<>();
        while(true){
            if(top>=n1.length || bottom>=n2.length){
                break;
            }
            if(n1[top]==n2[bottom]){
                lst.add(n1[top]);
                top++;
                bottom++;
            }
            else if(n1[top]<n2[bottom]){
                top++;
            }
            else{
                bottom++;
            }
        }
        int[] res = new int[lst.size()];
	    for (int i = 0; i < lst.size(); i++) {
		    res[i] = lst.get(i);
	    }
	    return res;
    }
}
