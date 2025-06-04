/* Write a program that takes a character input from the user and prints the next 10 characters in the Unicode sequence. */
import java.util.Scanner;

public class Next_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter a character: ");
        char ch = sc.next().charAt(0);
        
        System.out.println("\n Next 10 characters:");
        for (int i = 1; i <= 10; i++) {
            System.out.print((char)(ch + i) + " ");
        }
    }
}

/* Output:*/
/*Enter a character: b

 Next 10 characters:
c d e f g h i j k l */
