import java.util.*;
class first1
{
  String username[10];
  String password[10];
  int c=0;
  void options()
  {
    String p,u,q,r,s;
    Scanner sc=new Scanner(System.in);
    int ch;
    System.out.println("1.Login\n2.Register\nEnter your choice");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1: System.out.println("Enter username");
              u=sc.next();
              System.out.println("Enter password");
              p=sc.next();
              q=check(u,p);
              if(q!=-1)
              {
                
              }
              else
              {
                System.out.println("Invalid credentials");
              }
              break;
      case 2: System.out.println("Enter username"); 
              r=sc.next();
              ucheck(r);
              System.out.println("Enter password"); 
              s=sc.next();
              pcheck(s);
              break;
    }
  }
  void check(String u,String p)
  {
    
  }
  void ucheck(String r)
  {
 
  }
  void pcheck(String s)
  {
    
  }
  
}
class first
{
  public static void main(String args[])
  {
    
  }
}