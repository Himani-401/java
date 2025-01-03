public class binary_to_dec {
    public String binaryToDecimal(String binaryNum) {
        //Write yiur code here
        int i=0;
        int ans=0;
        while(i<binaryNum.length()){
            if(binaryNum.charAt(i)=='1'){
                ans+=(Math.pow(2,binaryNum.length()-i-1));
            }
            i++;

        }
        return Integer.toString(ans);
    }
}
