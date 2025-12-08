import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        int largest;

        if (x >= y && x >= z)
            largest = x;
        else if (y >= x && y >= z)
            largest = y;
        else
            largest = z;

        System.out.println("Largest number = " + largest);
    }
}
