/* Write a program in Java that accepts a string and passes it to a function Display(String str), which prints all the consonants (non-vowel letters) in the string.
Example:

Input: computer → Output: c, m, p, t, r.
*/
import java.util.Scanner;
class ConsonantDisplay
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("\n Enter a string: ");
    String input= sc.next();
    System.out.println("\n The consonants are: ");
    Display(input);
    }
    public static void Display(String str)
    {
        String vowels= "AEIOUaeiou";
        for(int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch)== -1)
                System.out.println(ch);
        }
    }
}
/* Output
  Enter a string: 
mango

 The consonants are: 
m
n
g
 */