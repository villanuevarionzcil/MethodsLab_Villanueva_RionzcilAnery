import java.util.Scanner;

public class MethodsLab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Greetings Method
        greetUser();

        // Task 2: Basic Arithmetic Calculator
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // Task 3: Factorial Using a Method
        System.out.print("\nEnter a number for factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial: " + factorial(factNum));

        // Task 4: Array Summation Method
        int[] numbers = {10, 15, 20, 15, 15}; // example array
        System.out.println("\nSum of array elements: " + sumArray(numbers));

        // Task 5: Prime Number Checker
        System.out.print("\nEnter a number to check prime: ");
        int primeNum = sc.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }

        sc.close();
    }

    // Task 1: Method Without Return Value
    public static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // Task 2: Basic Arithmetic Methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    // Task 3: Factorial Method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Task 4: Array Summation Method
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Task 5: Prime Number Checker
    public static boolean isPrime(int n) {
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
}
