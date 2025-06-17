//To print Armstrong Number
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int n = String.valueOf(num).length();
        while (num != 0) 
        {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        if (sum == original) 
        {
            System.out.println(original + " is an Armstrong number.");
        } else
        {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

          