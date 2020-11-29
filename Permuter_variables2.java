//----Code Java ----------//
class Permuter_variables {
    public static void main(String[] args) 
	{
        int x,y, tmp;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		
        System.out.println("Avant permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("Après permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
//---- Fin du Code Java ----------//
