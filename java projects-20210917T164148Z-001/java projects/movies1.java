package mpack;
import java.util.*;
public class movies1
{
  public void genre()
  {
    Scanner sc=new Scanner(System.in);
    int ch1;
    System.out.println("\n1.Comedy\n2.Horror\n3.Romance\n4.Sci-fi");
    ch1=sc.nextInt();
    switch(ch1)
    {
      case 1: comedy();
              break;
      case 2: horror();
              break;
      case 3: romance();
              break;
      case 4: scifi();
              break;
    }
  }
  public void year()
  {
    Scanner sc=new Scanner(System.in);
    int ch2;
    System.out.println("\n1.2000-2005\n2.2006-2010\n3.2011-2015\n4.2016-2018");
    ch2=sc.nextInt();
    switch(ch2)
    {
      case 1: one();
              break;
      case 2: two();
              break;
      case 3: three();
              break;
      case 4: four();
              break;
    }
  }
  public void one()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] oneE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Comedy Movies released between 2000-05 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+oneE[i]);
              }
              break;
     case 2:  String[] oneH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Comedy Movies released between 2000-05 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+oneH[i]);
              }
              break;
    }
  }
  public void two()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] twoE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Comedy Movies released between 2006-10 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+twoE[i]);
              }
              break;
     case 2:  String[] twoH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Comedy Movies released between 2006-10 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+twoH[i]);
              }
              break;
    }
  }
  public void three()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] threeE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Comedy Movies released between 2011-15 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+threeE[i]);
              }
              break;
     case 2:  String[] threeH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Comedy Movies released between 2011-15 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+threeH[i]);
              }
              break;
    }
  }
  public void four()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] fourE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Comedy Movies released between 2016-18 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+fourE[i]);
              }
              break;
     case 2:  String[] fourH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Comedy Movies released between 2016-18 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+fourH[i]);
              }
              break;
    }
  }
 public void comedy()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] cmoviesE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Comedy Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+cmoviesE[i]);
              }
              break;
     case 2:  String[] cmoviesH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Comedy Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+cmoviesH[i]);
              }
              break;
    }
  }
 public void horror()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] hmoviesE={"Conjuring", "Insidious", "Anabelle", "Purge"};
              System.out.println("The list of English Horror Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+hmoviesE[i]);
              }
              break;
     case 2:  String[] hmoviesH={"cf", "poijuh", "xdcf", "drfcvg"};
              System.out.println("The list of Hindi Horror Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+hmoviesH[i]);
              }
              break;
    }
  }
public void romance()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] rmoviesE={"Pretty Women", "Twilight", "Book Club", "Tangled"};
              System.out.println("The list of English Romance Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+rmoviesE[i]);
              }
              break;
     case 2:  String[] rmoviesH={"sed", "drtfg", "xdcf", "tfgh"};
              System.out.println("The list of Hindi Romance Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+rmoviesH[i]);
              }
              break;
    }
  }
  public void scifi()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] smoviesE={"fcg", "ftygh", "dfcgv", "sedtrf"};
              System.out.println("The list of English Sci-Fi Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+ smoviesE[i]);
              }
              break;
     case 2:  String[] smoviesH={"drttf", "derf", "tyu", "yuhj"};
              System.out.println("The list of Hindi Sci-Fi Movies are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+ smoviesH[i]);
              }
              break;
    }
  }
public void movies()
{
    int ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Search movies by-\n1.Genre\n2.Year");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1: genre();
              break;
      case 2: year();
              break;
    }
}
}