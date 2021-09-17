import java.util.*;
abstract class volume
{
abstract void calc(int r);
}
class sphere extends volume
{
void calc(int r)
{
System.out.println("the volume of sphere is "+(4/3*3.14*r*r*r));
}
}
class hemisphere extends volume
{
void calc(int r)
{
System.out.println("the volume of hemisphere is "+(2*3.14*r*r*r)/3);
}
}
class abspro
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
sphere s=new sphere();
System.out.println("enter the radius of sphere");
int r=sc.nextInt();
s.calc(r);

hemisphere h=new hemisphere();
System.out.println("enter the radius of hemisphere");
int q=sc.nextInt();
h.calc(q);
}
}

