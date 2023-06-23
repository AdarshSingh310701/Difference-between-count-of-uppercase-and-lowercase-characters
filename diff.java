import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        // Check if the size is within the valid range
        if (size < 3 || size > 20) {
            System.out.println(size + " is an invalid size.");
            return;
        }

        System.out.println("Enter the numbers:");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculate the sum of numbers by adding each number to the next number
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);
    }
}
