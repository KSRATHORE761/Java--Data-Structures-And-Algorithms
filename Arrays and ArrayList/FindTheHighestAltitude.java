/*
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
 * The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain
 in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */

//https://leetcode.com/problems/find-the-highest-altitude/ 
public class FindTheHighestAltitude {
    public static void main(String[] args){
        int[] gain={-5,1,5,0,-7};
        System.out.println("Highest Altitude : " + largestAltitude(gain));
    }
      static int largestAltitude(int[] gain) {
        int n = gain.length;
        // int[] altitude = new int[n+1];
        // altitude[0] = 0;
        // for(int i = 0;i<n;i++){
        //     altitude[i+1] = altitude[i] + gain[i];
        // }
        // int max_altitude = Integer.MIN_VALUE;
        // for(int i =0;i<n+1;i++){
        //     max_altitude = Math.max(max_altitude,altitude[i]);
        // }
        // return max_altitude;
        int cur_altitude = 0;
        int max_altitude = 0;
        for(int i = 0;i<n;i++){
            cur_altitude +=gain[i];
            max_altitude = Math.max(max_altitude,cur_altitude);
        }
        return max_altitude;
    }
}
