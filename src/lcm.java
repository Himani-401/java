import java.util.*;
public class lcm {


        public int gcd(int a , int b){
            if(b==0){
                return a;
            }
            return gcd(b,a%b);
        }
        public int findLcm(int a, int b) {
            return Math.abs((a*b)/gcd(a,b));

        }

}
