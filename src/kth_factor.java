import java.util.*;
public class kth_factor {
    public int kthFactor(int n, int k) {
        // Write your code here
        List<Integer> list =new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i*i!=n){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        if(list.size()>=k){
            return list.get(k-1);
        }
        return -1;

    }
}
