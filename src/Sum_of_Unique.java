import java.util.*;
public class Sum_of_Unique {
        public int sumOfUnique(int[] nums) {
            int ans=0;
            Map<Integer,Integer> map=new HashMap<>();
            for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                if(e.getValue()==1){
                    ans+=e.getKey();
                }
            }
            return ans;}
}
