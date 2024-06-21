//euclidean algorithm is used to find GCD//
//time complaxity O(logn)//
public class euclidean {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a=24;
        int b=60;
        int ans=gcd(a, b);
        System.out.println(ans);
    }
}
