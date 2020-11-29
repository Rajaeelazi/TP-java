public class TstThr1
{
	public static void main (String args[])
 {
 Ecrit e1 = new Ecrit ("bonjour e1 ", 10, 5) ;
 Ecrit e2 = new Ecrit ("bonsoir e2 ", 12, 10) ;
 Ecrit e3 = new Ecrit ("Bonne nuit e3 ", 5, 15) ;
 e1.start() ;
 e2.start() ;
 e3.start() ;
 }
}
class Ecrit extends Thread
{ 
public Ecrit (String texte, int nb, long attente)
 {
    this.texte = texte ;
	this.nb = nb ;
    this.attente = attente ;
 }
 public void run ()
 { 
 try{
	 for (int i= 0 ; i<nb ; i++){
		 System.out.println(texte) ;
         sleep(attente) ;
 }
 }
 catch (InterruptedException e) {}
 // impose par sleep
 }
 private String texte ;
 private int nb ;
 private long attente ;
}