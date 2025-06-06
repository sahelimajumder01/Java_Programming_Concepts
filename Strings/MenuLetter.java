import java.util.Scanner;

public class MenuLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter 'U' for uppercase Z-A");
        System.out.println("\n Enter 'L' for lowercase a-z");
        char choice = sc.next().charAt(0);
        
        switch (Character.toUpperCase(choice)) {
            case 'U':
                for (char c = 'Z'; c >= 'A'; c--) {
                    System.out.print(c + " ");
                }
                break;
            case 'L':
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.print(c + " ");
                }
                break;
            default:
                System.out.println("\n Invalid choice");
        }
    }
}
/*
  Enter 'U' for uppercase Z-A

 Enter 'L' for lowercase a-z
U
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A 
 */