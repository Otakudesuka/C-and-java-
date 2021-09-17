import java.util.*;
abstract class calculate
{
  abstract void calc(double r);
}
class sphere extends calculate
{
  void calc(double r)
  {
    double v=(4/3)*3.14*r*r*r;
    System.out.println("Volume of sphere= "+v);
  }
}
class hemisphere extends calculate
{
  void calc(double r2)
  {
    double v=(4*3.14*r2*r2*r2)/6;
    System.out.println("Volume of hemisphere= "+v);
  }
}
class abstractdemo
{
  public static void main(String args[])
  {
    sphere s=new sphere();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of sphere");
    double r1=sc.nextDouble();
    s.calc(r1);
    hemisphere h=new hemisphere();
    System.out.println("Enter radius of hemisphere");
    double r2=sc.nextDouble();
    h.calc(r2);
  }
}

