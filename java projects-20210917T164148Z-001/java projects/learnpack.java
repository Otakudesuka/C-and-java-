import addition.*;
import subtraction.*;
import java.util.*;
class learnpack
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    learnpack l=new learnpack();
    add1 p=new add1();
    sub1 q=new sub1();
    int ch,a,b;
    System.out.println("1.Addition\n2.Subtraction\nEnter your choice");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1: System.out.println("Enter a and b");
              a=sc.nextInt();
              b=sc.nextInt();
              p.add(a,b);
              break;
     case 2: System.out.println("Enter a and b");
              a=sc.nextInt();
              b=sc.nextInt();
              q.sub(a,b);
              break;
    }
  }
}