public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";   
        System.out.println("Defanged IP Address : "+address.replace(".","[.]"));
    }
    public static String defangIPAddress(String address){
        StringBuilder sb = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c=='.'){
                sb.append("["+c+"]");
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
