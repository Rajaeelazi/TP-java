class Exemple
 {
public boolean b = true;
public boolean set(boolean x) {
x = !x ;
return (x == b);
}
public static void main(String[] args) {
Exemple ex = new Exemple();
ex.b = ex.set(ex.b);
System.out.println(ex.b);
}
}