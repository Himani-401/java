import java.util.*;
public class count_jewel_in_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        Set<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);

        }
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)){
                ans++;
            }
        }
        return ans;
    }
}
