import java.util.*;
public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[] {i, map.get(comp)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}