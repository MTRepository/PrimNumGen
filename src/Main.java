import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double startTime;
        double endTime;
        double timeSimpleSearch;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give an integer: ");
        int maxPrimeNumber = scan.nextInt();

        Methods method1 = new Methods();

        startTime = System.currentTimeMillis();

        method1.getPrimeSimpleEnhanced(maxPrimeNumber);

        endTime = System.currentTimeMillis();
        timeSimpleSearch = endTime - startTime;
        System.out.println("\nCalculation time: " + timeSimpleSearch + " msec.");

    }

}
