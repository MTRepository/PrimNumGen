import java.util.LinkedList;

public class Methods {

    public Methods() {
    }

    public void getPrimeSimpleSearch(int maxPrimeNumber) {

        boolean isPrime = false;

        if (maxPrimeNumber <= 1) System.out.println("No primes in the given range!");
        if (maxPrimeNumber > 1) {
            System.out.println("Prime number found: 2"); // 2 is the smallest prime number
        }

        for (int i = 2; i <= maxPrimeNumber; i++) {
            for (int j = 2; j < i; j++) {
                if (i % 2 == 0) {
                    isPrime = false;
                    break;
                } else if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) System.out.println("Prime number found: " + i);
        }

    }

    public void getPrimeSimpleEnhanced(int maxPrimeNumber) {

        LinkedList<Integer> primes = new LinkedList<Integer>();

        primes.add(2);  // the first prime number is 2
        primes.add(3);  // the second prime number is 3

        if (maxPrimeNumber <= 1) System.out.println("No prime numbers in the given range!");

        for (int i = 4; i <= maxPrimeNumber; i++) {

            boolean isPrime = false;

            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) primes.add(i);
        }
        System.out.println("The prime numbers found in the given range:");
        System.out.println(primes);
    }
}