//finbonacci series with DP concept//
//time complaxity=O(2^n),space complaxity=O(n)//
import java.util.HashMap;
import java.util.Scanner;

public class fibonacci {
    
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    //  ****.......by dynamic programing approch.........***//
    //------>>by Memoization technique   //
    public static HashMap<Integer,Integer>map=new HashMap<>();
    public static int fib_dp(int n){
        if(n<=1){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int temp= fib_dp(n-1)+fib_dp(n-2);
        map.put(n,temp);
        return temp;

    }
    //time complaxity O(n)  ;space complaxity O(n) //
    //----->by tabulation tecnique //
    public static int fibo_dp(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    //time complaxity O(n)  ;space complaxity (1) //
    //most optimized solution //
    public static int fiboo(int n){
        int f=0;
        int s=1;
        int r=0;
        for(int i=1;i<=n;i++){
            r=s+f;
            s=f;
            f=r;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=fiboo(n);
        System.out.println(result);
    }
}
