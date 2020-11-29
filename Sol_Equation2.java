import java.util.Scanner;
class Sol_Equation2 {
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez a: ");
        double a = scanner.nextDouble();	

        System.out.print("Entrez b: ");
        double b = scanner.nextDouble();
		
		System.out.print("Entrez c: ");
        double c = scanner.nextDouble();
		
        double D,x1,x2;
		
		System.out.println("La solution de l'équation :"+a+"x2+"+b+"x+"+c+"=0 dans R :");
		
        if (a==0)
			if (b==0)
				if (c==0)
					System.out.println("S=R=tous les nombres réels");
				else
					System.out.println("S=Ensemble vide=pas de solution");
			else 
				System.out.println("S={x="+(-c/b)+"}");
		else
			{
				D=b*b-4*a*c;
				if (D>=0)
					{
						x1=(-b+Math.sqrt(D))/(2*a);
						x2=(-b-Math.sqrt(D))/(2*a);
						System.out.println("S={x1="+x1+", x2="+x2+"}");
					}
				else
					System.out.println("S=Ensemble vide=pas de solution dans R");
            }
	}
}
//---- Fin du Code Java ----------//