import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntersectionofArrayII {
    public static void main(String[] args) {
        int[] num1={4,9,5};
        int[] num2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersact(num1, num2)));
    }
    static int[] intersact(int[] num1,int[] num2){
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        int top=0;
        int bottom = 0;
        while(true){
            if(top>=num1.length || bottom>=num2.length){
                break;
            }
            if(num1[top]==num2[bottom]){
                lst.add(num1[top]);
                top++;
                bottom++;
            }
            else if(num1[top]<num2[bottom]){
                top++;
            }
            else{
                bottom++;
            }
        }
        int[] res= new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i] = lst.get(i);
        }
        return res;
    }
}
