// Java program to reverse a number
// and find if it is a palindrome or not

// Driver Class
class Geeks
{
    // Recursive function to reverse
    // the digits of number
    static int recursive_func(int n, int rev)
    {
        if (n < 10) {
            return rev * 10 + n;
        }
        else {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            return recursive_func(n / 10, rev);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 123464321;
        int rev = recursive_func(n, 0);

        System.out.println("Reverse of n = " + rev);

        // Checking if n is same
        // as reverse of n
        if (n == rev)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}