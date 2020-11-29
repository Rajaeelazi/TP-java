public class Factoriel4
{ 

public static void main (String args[])
{ 

	int N; 
	Factoriel4 Fact=new Factoriel4();

	N=Integer.parseInt(args[0]); //On convertit String to int gràce à la méthode parseInt
	System.out.println ("Factoriel de "+N+" est : "+Fact.fact(N)) ;
}

int fact(int n)
{
	int F=1;
	for(int i=2;i<=n;i++) F*=i;
	return F;
}

}