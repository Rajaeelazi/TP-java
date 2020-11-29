public class Factoriel6
{ 

public static void main (String args[])
{ 

	int N; 
	Factoriel61 Fact=new Factoriel61();

	N=Integer.parseInt(args[0]); //On convertit String to int gràce à la méthode parseInt
	System.out.println ("Factoriel de "+N+" est : "+Fact.fact(N)) ;
}

}

class Factoriel61{
	
	int fact(int n)
{
	int F=1;
	for(int i=2;i<=n;i++) F*=i;
	return F;
}
	
}