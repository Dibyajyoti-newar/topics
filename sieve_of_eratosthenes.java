//sieve_of_eratosthenes algorithm is used to print all prime number till n //
//time complaxity of this is O(nlog(log n))//

public class sieve_of_eratosthenes {
    public static void allPrime(int n){
        int prime[]=new int[n+1]; 
        for(int i=2;i<=n;i++){
            prime[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a=54;
        allPrime(a);
    }
}
