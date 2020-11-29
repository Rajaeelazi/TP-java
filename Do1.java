import java.util.Scanner ;
public class Do1
{ public static void main (String args[])
 {
 Scanner sc =new Scanner(System.in);
 
 do
 { System.out.print ("donnez un nombre >0 : ") ;
  int n = sc.nextInt();	
 System.out.println ("vous avez fourni " + n) ;
 }
 while (n < 0) ;
 System.out.println ("reponse correcte") ;
 }
}