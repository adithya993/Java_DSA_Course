package adi.practice.kunalkushwaha.math;

public class FindPrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        findPrime(n, primes);
    }

    public static void findPrime(int n, boolean[] arr){
        for(int i = 2; i*i < n;++i){
            if(!arr[i]){
                for(int j = i*2; j <= n ; j += i){
                    arr[j] = true;
                }
            }
        }
        for(int i = 2; i <=n ; ++i){
            if(!arr[i])
                System.out.print(i + " ");
        }
    }
}
