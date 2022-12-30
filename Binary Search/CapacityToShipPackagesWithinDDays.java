// A conveyor belt has packages that must be shipped from one port to another within days days.

// The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

//Logic : 
// The key is left = max(weights), right = sum(weights),
// which are the minimum and maximum possible weight capacity of the ship.

// Therefore the question becomes Binary Search to find the minimum weight capacity of the ship between left and right.
// We start from
// mid = (left + right) / 2 as our current weight capacity of the ship.
// need = days needed == 1
// cur = current cargo in the ship == 0

// Start put cargo into ship in order.
// when need > D, it means the current ship is too small, we modify left = mid + 1 and continue
// If all the cargo is successfully put into ships, we might have a chance to find a smaller ship, so let right = mid and continue.
// Finally, when our left == right, we reach our answer

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println("least weight capacity of the ship :"+shipWithinDays(weights,days));
    }
    static int shipWithinDays(int[] weights, int days) {
        int left = 0,right=0;
        for(int w : weights){
            left = Math.max(left,w);
            right +=w;
        }
        while(left<right){
            int mid = left + (right-left)/2;
            int days_Needed = 1,cur=0;
            for(int w : weights){
                if(cur+w>mid){
                    cur = 0;
                    days_Needed +=1;
                }
                cur +=w;
            }
            if(days_Needed>days){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
