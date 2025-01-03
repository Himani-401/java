public class sqrt {
    public int sqrt(int n) {
        long start=0;
        long end=n;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid<=n){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
