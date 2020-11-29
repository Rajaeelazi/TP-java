import java.util.Scanner ;
public class Default
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
 default : System.out.println ("grand") ;
 }
 System.out.println ("Au revoir");
 }
}