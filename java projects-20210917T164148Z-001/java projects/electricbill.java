import java .util.*
abstract class plan
{
abstract getrate(int r);
}
class commercial extends plan
{
int r;
void getrate()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the rate");
int r=sc.nextInt();
System.out.println("enter the unit");
int u=sc.nextInt();
}
}
class domestic extends plan
{
int r;
void getrate()
{
Scanner sc=new Scanner(System.in);
System.out.println(enter the rate");
int r=sc.nextInt();
System.out.println("enter the unit");
int u=scs.nextInt();
}
}
class electric
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.println);
System.out.println("1.domestic");
System.out.println("2.commercial");
int i=sc.nextInt();
if(i==1)
{
domestic d=new domestic();
d.getrate();
d.calbill();
}
if(i==2)
{
commercial c=new commercial();
c.getrate();
c.calbill();
}
}
}

