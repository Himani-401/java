import java.util.*;
public class factors_of_number {
    public List<Integer> factors(int n) {
        //Write your code here
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(i*i!=n){
                    list.add(n/i);
                }
            }

        }
        Collections.sort(list);
        return list;

    }
}
