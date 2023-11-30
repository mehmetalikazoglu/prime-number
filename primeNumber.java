import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number :");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 1) {
            System.out.println("invalid character!");
            return;
        }
        if (number == 1) {
            isPrime = false;

        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("The number you entered is  a prime number");
        } else {
            System.out.println("The number you entered is not a prime number");
        }
    }
}
