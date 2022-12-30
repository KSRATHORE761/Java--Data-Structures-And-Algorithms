import java.util.Map;
import java.util.HashMap;
/*
 https://leetcode.com/problems/roman-to-integer/
 */
public class RomantoInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println("Roman to Integer: "+findRomanToIntegerValue(s));
    }
    public static int findRomanToIntegerValue(String s){
        int res=0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=s.length()-1;i>=0;i--){
            if(i==s.length()-1){
                res +=map.get(s.charAt(i));
            }
            else{
                if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                    res +=map.get(s.charAt(i));
                }
                else{
                    res -=map.get(s.charAt(i));
                }
            }
        }
        return res;
    }
}
