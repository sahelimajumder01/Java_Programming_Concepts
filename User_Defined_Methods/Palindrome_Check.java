/*Write a program in Java using a method Palin() to check if a string is a Palindrome (reads the same backward as forward, e.g., "MADAM", "ARORA").
*/
import java.util.Scanner;
class Palindrome_Check
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter a string: ");
        String input= sc.next();
        if(Palin(input))
        {
            System.out.println("\n It is a Palindrome ");
            
        }
            else
            {
                System.out.println("\n It is not a Palindrome");
            
            }
    }
    public static boolean Palin(String str)
    {
        int left=0;
        int right= str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!= str.charAt(right))
                return false;
                left++;
                right--;
        }
        return true;
    }
}

/* Output
 Enter a string: 
madam

 It is a Palindrome 

 */