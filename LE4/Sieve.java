import java.util.ArrayList;
import java.util.List;

public class Sieve {
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n+1];
        java.util.Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for(int p = 2; p*p <= n; p++) {
            if(isPrime[p]) {
                for(int j = p*p; j <= n; j += p) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        
        System.out.println("Prime numbers up to " + n + " :");
        for(int i = 0; i <= n; i++) {
            if(isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}