public class gcd {
    public int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
//orrrr
    public int gcd1(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {

            return gcd1(a - b, b);
        } else {
            return gcd1(a, b - a);
        }

    }

}
