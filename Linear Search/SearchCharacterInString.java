public class SearchCharacterInString {
    public static void main(String[] args){
        String myName = "kuldeep";
        char target = 'u';
        boolean result = LinearSearchCharacter(myName,target);
        if(result){
            System.out.println("Charcter "+target+" is found in "+myName+"");
        }
        else{
            System.out.println("Charcter "+target+" is  not found in "+myName+"");
        }

    }
    static boolean LinearSearchCharacter(String s, char target){
        if(s.length() == 0){
            return  false;
        }
        for(char c : s.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
