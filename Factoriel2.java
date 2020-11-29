public class Factoriel2
{ public static void main (String args[])
{ 

int N, F=1; // F est le factoriel de N

N=Integer.parseInt(args[0]);

for(int i=2;i<=N;i++) F*=i;
System.out.println ("Factoriel de "+N+" est : "+F) ;
}
}