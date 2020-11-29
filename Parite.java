import java.util.Scanner;
public class Partie
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Tapez un entier	n : ");
	int n = sc.nextInt();
    if ((n & 1) ==1)
    System.out.println ("il est impair") ;
    else
    System.out.println ("il est pair") ;
}
}