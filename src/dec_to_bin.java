public class dec_to_bin {
    public String decimalToBinary(int n) {
        String bin="";
        if(n==0){
            return "0";
        }
        if(n<0){
            return "Invalid input";
        }
        while(n>0){
            int rem=n%2;
            bin=rem+bin;

            n=n/2;
        }
        return bin;

    }
}
