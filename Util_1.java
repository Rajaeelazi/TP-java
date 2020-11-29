class Util_1
{ 
static void raz (int t[] [])
 {
 int i, j ;
 for (i = 0 ; i<t.length ; i++) // for... each non applicable ici
 for (j = 0 ; j<t[i].length ; j++) // puisque modification des valeurs de t
 t[i] [j] = 0 ;
 }
 static void affiche (int t[][])
 { 
 int i, j ;
 for (i = 0 ; i<t.length ; i++)
 {
	 System.out.print ("ligne de rang " + i + " ") ;
 for (j = 0 ; j<t[i].length ; j++) // pour utiliser for... each
 System.out.print (t[i] [j] + " ") ; // voir paragraphe suivant
 System.out.println() ;
 }
 }
}
class Tab2ind1
{
	public static void main (String args[])
 {
	 int t[] [] = { {1, 2, 3}, {11, 12}, {21, 22, 23, 24} } ;
 System.out.println ("t avant raz : ") ;
 Util_1.affiche(t) ;
 Util_1.raz(t) ;
 System.out.println ("t apres raz : ") ;
 Util_1.affiche(t) ;
 }
}