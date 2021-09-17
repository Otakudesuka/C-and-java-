import java.io.*;
import java.util.Vector;
import java.util.*;
class java6
{
public static void main(String args[])
{

int c=0,j;
Scanner sc=new Scanner(System.in);
Vector v = new Vector();
String s,city;
    do
    {
        System.out.println("Select your choice:");
            System.out.println("1 - Add Element");
        System.out.println("2 - Remove Element");
        System.out.println("3 - View Elements");
        System.out.println("4 - Exit");
        c=sc.nextInt();
        switch(c)
        {
            case 1: 
                System.out.println("Enter city name:");
                city=sc.next();
                if(v.contains(city))
                System.out.println("City  name already exists");
                else
                {
                    v.addElement(city);
                    System.out.println("City name added");
                }
                break;

            case 2 : if(v.isEmpty())
                System.out.println("City name list is empty");
                else
                {
                    System.out.println("Enter city name:");
                    city=sc.next();
                if(v.contains(city))
                {
                    v.removeElement(city);
                    System.out.println("City name removed");
                }
                else
                System.out.println("City name does not exist");
                }
                break;

            case 3 : if(v.isEmpty())
                System.out.println("City name list is empty");
                else 
                System.out.println("Vector : "+v.toString());
                break;
            case 4 : System.exit(0);
                    break;  
        }
        System.out.println("To continue : 1");
        System.out.println("To stop : 0");
       j=sc.nextInt();

    }while(j!=0);

}

}