class Util
{ 
public static void Echange (int a, int b) // ne pas oublier static
 {
 System.out.println ("début Échange : " + a + " " + b) ;
 int c ;
 c = a ;
 a = b ;
 b = c ;
 System.out.println ("fin Échange : " + a + " " + b) ;
 }
}
class Echange
{
	public static void main (String args[])
 {
	 int n = 10, p = 20 ;
 System.out.println ("avant appel : " + n + " " + p) ;
 Util.Echange (n,p) ;
 System.out.println ("apres appel : " + n + " " + p) ;
 }
} 