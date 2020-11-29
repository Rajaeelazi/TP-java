public class Calcul
{
public static void main(String[]args)
{
int T[] = new int[10];
int y;
for(int i=0; i<=10;i++){
T[i] = i;
//y=1/i;
}
//y=1/0;
double x =10, z;
z = Math.sgrt(x);
System.out.print("z = "+z);
}
}
class MonException extends Exception {
	public MonException(String msg){
		super(msg);
	}
}