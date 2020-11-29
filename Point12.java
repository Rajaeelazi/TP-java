class Point12 
{
int x, y;
public Point12(int xx, int yy) 
{
 x = xx; 
 y = yy; 
}
public void change(Point12 p) 
{
 p.x += x; 
 p.y += y; 
}
public static void main(String[] args)
{
Point12 a = new Point12(2, 3), b = new Point12(5, 10);
a.change(b);
print(a);
print(b);
}
}