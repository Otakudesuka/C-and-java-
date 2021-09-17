import java.util.*;
abstract class bill
{
  abstract void getrate();
  abstract void calc(int u);
}
class commercial extends bill
{
  float cr;
  void getrate()
 {
   System.out.println("Enter the commercial rate");
   Scanner sc=new Scanner(System.in);
   cr=sc.nextFloat();
 }
 void calc(int u)
 {
   float total;
   total=cr*u;
   System.out.println("Rate Type: Commercial");
   System.out.println("Rate: "+cr);
   System.out.println("Number of units: "+u);
   System.out.println("Total bill: "+total);
 }
}
class domestic extends bill
{
  float dr;
  void getrate()
 {
   System.out.println("Enter the domestic rate");
   Scanner sc=new Scanner(System.in);
   dr=sc.nextFloat();
 }
 void calc(int u)
 {
   float total;
   total=dr*u;
   System.out.println("Rate Type: Domestic");
   System.out.println("Rate: "+dr);
   System.out.println("Number of units: "+u);
   System.out.println("Total bill: "+total);
 }
}
class ebill
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the type of usage:\n1.Commercial\n2.Domestic");
   int ch=sc.nextInt();
   switch(ch)
   {
     case 1: commercial c=new commercial();
             c.getrate();
             System.out.println("Enter the number of units consumed");
             int u=sc.nextInt();
             c.calc(u);
             break;
    case 2:  domestic d=new domestic();
             d.getrate();
             System.out.println("Enter the number of units consumed");
             int u1=sc.nextInt();
             d.calc(u1);
             break;
   }
  }
}
