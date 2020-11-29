import java.util.Scanner;
public class Factoriel3
{ 

public static void main (String args[])
{ 
Scanner scanner = new Scanner(System.in);

	int N; 

	N=Integer.parseInt(args[0]); //On convertit String to int gràce à la méthode parseInt
	System.out.println ("Factoriel de "+N+" est : "+fact(N)) ;
}

static int fact(int n)
{
	int F=1;
	for(int i=2;i<=n;i++) F*=i;
	return F;
}

}