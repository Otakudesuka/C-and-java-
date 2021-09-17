import java.util.*;

class employee

{
  
int y,id;
  float sal;
  String name;
  
void input()
  
{
    Scanner sc= new Scanner(System.in);
    
     System.out.println("Enter name");
    
     name=sc.next();
    
     System.out.println("Enter id");
    
     id=sc.nextInt();
    
     System.out.println("Enter salary");
    
     sal=sc.nextFloat();
    
     System.out.println("Enter number of years");
    
     y=sc.nextInt();
  
}
  
void calc()
  
{
    
     if(y>10)
      
       sal=sal+(sal*0.1f);
    
     else if(y>5 && y<10)
      
       sal=sal+(sal*0.07f);
    
     else if(y>3 && y<5)
      
       sal=sal+(sal*0.03f);
    
     else if(y>=2 && y<3)
      
       sal=sal+(sal*0.02f);
    
     else if(y<2)
      
       sal=sal+1500;
  
}
  
void display()
  
{
    
     System.out.println("Employee name: "+name);
    
     System.out.println("Employee id: "+id);
    
     System.out.println("Employee final salary: "+sal);
     
  
}
 
 public static void main(String args[])
  
{
    
     employee e=new employee();
    
     e.input();
    
     e.calc();
    
     e.display();
  
}

}
