import java.util.Scanner ;
public class Switch1
{ public static void main (String[] args)
 { 
 Scanner sc = new Scanner(System.in);
 System.out.print ("donnez un nombre entier : ") ;
 int n = sc.nextInt();
 switch (n)
 { case 0 : System.out.println ("nul") ;
 break ;
 case 1 : System.out.println ("un") ;
 break ;
 case 3 : System.out.println ("trois") ;
 break ;
 }
 System.out.println ("Au revoir");
 }
}