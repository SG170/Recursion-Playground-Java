public class Main {

    //  Factorial
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    //  Fibonacci
    static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //  Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    //  Power
    static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    //  Reverse Number
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    //  GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    //  MAIN METHOD
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Recursion Playground =====");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Sum of Digits");
            System.out.println("4. Power of a Number");
            System.out.println("5. Reverse a Number");
            System.out.println("6. GCD");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    System.out.println("Factorial = " + factorial(sc.nextInt()));
                    break;

                case 2:
                    System.out.print("Enter n: ");
                    System.out.println("Fibonacci = " + fibonacci(sc.nextInt()));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    System.out.println("Sum of digits = " + sumOfDigits(sc.nextInt()));
                    break;

                case 4:
                    System.out.print("Enter base & exponent: ");
                    System.out.println("Power = " + power(sc.nextInt(), sc.nextInt()));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    System.out.println("Reverse = " + reverse(sc.nextInt(), 0));
                    break;

                case 6:
                    System.out.print("Enter two numbers: ");
                    System.out.println("GCD = " + gcd(sc.nextInt(), sc.nextInt()));
                    break;

                case 0:
                    System.out.println("Goodbye ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
