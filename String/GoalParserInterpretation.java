
/*
You own a Goal Parser that can interpret a string command. 
The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" 
as the string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command. 
 */

 //https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {
    public static void main(String[] args){
        String command = "(al)G(al)()()G";
        System.out.println("Interpreted String : "+ interpret(command));
    }
    public static String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt((i))=='G'){
                sb.append('G');
            }
            if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }
                else{
                    sb.append("al");
                    i = i+3;
                }
            }
        }
        return sb.toString();
    }
}
