import java.util.*;
public class count_no_of_primes {
    public int countPrimes(int n) {
        //Write your code here
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);

        prime[0]=prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
}
