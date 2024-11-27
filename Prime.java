import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Prime numbers from 1 to 100:");
            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NoSuchElementException e) {
            System.out.println("No input available.");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // Check divisors up to square root of num
            if (num % i == 0) {
                return false; // If divisible, not a prime
            }
        }
        return true; // Otherwise, it's a prime
    }
}
