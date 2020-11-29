import java.util.Scanner ;
public class For_1
{
	public static void main (String args[])
 {
	Scanner sc = new Scanner(System.in);
    int i ;
	String x;
	System.out.print("tapez une chaine :");
    x = sc.nextLine();
	System.out.print("tapez un nombre : ");	
    int n = sc.nextInt();
	
for (i = 1 ; i<= n ; i++)
 { 
    System.out.print (x+" "+i+ " fois ") ;
 }
 }
}