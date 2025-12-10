import java.util.Scanner;

public class DecTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Total digits in " + n + " = " + count);
    }
}
