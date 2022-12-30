public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int  hour = 8;
        System.out.println("Minimum Eating Speed : "+ minEatingSpeed(piles,hour));
    }
    static int minEatingSpeed(int[] piles, int h) {
        // We assume the smallest 
        int left = 0, right=piles[0];
        // To get the smallest and the largest pile.
        for(int pile : piles){
            right = Math.max(right,pile);
        }
        // Now we will do a binary search between the largest and the smallest pile 
        // to find a suitable speed which is lowest and yet can help to finish bananas in
        // given time 'h'.
        while(left<right){
            int mid = left + (right-left)/2;
            if(h<timetaken(piles,mid)){
                left = mid+1;   // speed up;
            }
            else{
                right = mid; //Slow down;
            }
        }
        return left;
    }
    static int timetaken(int[] piles,int speed){
        int c= 0;
        for(int pile : piles){
            c+=Math.ceil((double)pile/speed);
        }
        return c;
    }
}
