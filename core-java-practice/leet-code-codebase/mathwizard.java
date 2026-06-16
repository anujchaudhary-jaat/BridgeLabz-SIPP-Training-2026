import java.util.*;

public class mathwizard {

    // Prime number check
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Fibonacci using int
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Factorial
    public int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mathwizard mw = new mathwizard();

        System.out.println("===== Math Wizard =====");
        System.out.println("1 = Prime Check");
        System.out.println("2 = Fibonacci");
        System.out.println("3 = Factorial");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int primeNum = sc.nextInt();
                if (mw.isPrime(primeNum)) {
                    System.out.println(primeNum + " is a Prime Number.");
                } else {
                    System.out.println(primeNum + " is NOT a Prime Number.");
                }
                break;

            case 2:
                System.out.print("Enter n for Fibonacci: ");
                int fibNum = sc.nextInt();
                System.out.println("Fibonacci(" + fibNum + ") = " + mw.fibonacci(fibNum));
                break;

            case 3:
                System.out.print("Enter a number for Factorial: ");
                int factNum = sc.nextInt();

                if (factNum < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {
                    System.out.println(factNum + "! = " + mw.fact(factNum));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
