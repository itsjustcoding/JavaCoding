import java.io.*;
import java.util.*; 
class nextPalindrome
{
   
    // Function to check whether number is palindrome or not
    static int isPalindrome(int num)
    {
       
        // Declaring variables
        int n, k, rev = 0;
       
        // storing num in n so that we can compare it later
        n = num;
       
        // while num is not 0 we find its reverse and store
        // in rev
        while (num != 0) {
            k = num % 10;
            rev = (rev * 10) + k;
            num = num / 10;
        }
       
        // check if num and its reverse are same
        if (n == rev) {
            return 1;
        }
        else {
            return 0;
        }
    }
   
  // Driver code
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
        // Take any number to find its next palindrome
        // number
        int num = sc.nextInt();
       
        // If number is not Palindrome we go to the next
        // number using while loop
        while (isPalindrome(num) == 0) {
            num = num + 1;
        }
       
        // now we get the next Palindrome so let's print it
        System.out.print("Next Palindrome :");
        System.out.print(num);
    }
}