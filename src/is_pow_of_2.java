public class is_pow_of_2 {
    public boolean isPowOfTwo(int n) {
        //Write your code here
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;

        }
        return isPowOfTwo(n/2);

    }
}
