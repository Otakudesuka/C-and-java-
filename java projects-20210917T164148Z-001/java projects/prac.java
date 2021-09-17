import java.util.*;
class parent
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
void display()
{
System.out.println(" value of i in parent is "+i);
}
}
class child extends parent
{
int i=sc.nextInt();
void display()
{

System.out.println(" value of i in child is "+i);
System.out.println(" value of i in child is "+super.i);
}
}
class prac
{
public static void main(String args[])
{
child c=new child();
c.display();
}
}

 

                  
