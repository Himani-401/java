import java.util.*;
public class gcd_of_array {


        public int gcd(int a , int b){
            if(b==0){
                return a;
            }
            else{
                return gcd(b,a%b);
            }
        }
        public int gcdOfArray(int[] nums) {
            Arrays.sort(nums);
            int n=nums.length;
            int smallest=nums[0];
            int largest=nums[n-1];
            return gcd(smallest,largest);

        }

}
