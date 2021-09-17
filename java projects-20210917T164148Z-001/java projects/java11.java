import java.util.*;
class data
{  double r;
   public void getdata(int r1)
   {
      r=r1;
   }
}
class circle extends data
{  double area;
   public void calc()
   {
      area=(22*r*r*r)/7;
   }
}
class sphere extends circle
{
   public void volume()
   {
       double vol=(4*area)/3;
       System.out.println("volume of the sphere is "+vol);
   }
}
class java11
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radius");
      int r1=sc.nextInt();
      sphere s=new sphere();
      s.getdata(r1);
      s.calc();
      s.volume();  
   }
}
