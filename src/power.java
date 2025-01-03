public class power {
    public double poww(double n, int p){
        if(p==0){
            return 0;
        }
        if(p==1){
            return n;
        }
        double ans=poww(n,p/2);
        if(p%2==0){
            return ans*ans;

        }
        return ans*ans*n;
    }
    public double pow(double n, int p) {
        //Write yor code here
        boolean isneg=false;
        if(p<0){
            isneg=true;
            p=p*-1;

        }
        double ans=poww(n,p);
        if(isneg){
            return 1/ans;
        }
        return ans;

    }
}
