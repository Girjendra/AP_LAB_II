import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        List<Integer> primes = Sieve.sieveOfEratosthenes(n);

        for(int p : primes)
            System.out.print(p + " ");

        System.err.println("\nTotal prime numbers up to " + n + " : "+ primes.size());
        sc.close();
    }
}
