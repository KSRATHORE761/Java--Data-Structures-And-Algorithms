//https://leetcode.com/problems/maximum-population-year/
public class MaximumPopullationYear {
    public static void main(String[] args){
        int[][] logs = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        System.out.println("Maximum Popullation Year is "+ maximumPopulation(logs));
    }   
    static int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
       // O(n) -> n is log.length

       for(int[] log : logs){
           year[log[0] - 1950] +=1;
           year[log[1] - 1950] -=1;
       }
       
       int maxNum = year[0], maxYear = 1950;

       for(int i = 1; i < year.length; i++){
           year[i] += year[i - 1];  // Generating Prefix Sum
           if(year[i] > maxNum){
               maxNum = year[i];
               maxYear = i + 1950;
           }
       }
       return maxYear;
   }
}
