import mpack.movies1.*;
import tpack.tvshows1.*;
import java.util.*;
class first
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int option;
    System.out.println("\n1.Movies\n2.Tv Shows\nEnter you choice");
    option=sc.nextInt();
    switch(option)
    {
      case 1: movies1 y=new movies1();
              y.movies();
              break;
      case 2: tvshows1 z=new tvshows1();
              z.tvshows();
              break;
    }
  }
}