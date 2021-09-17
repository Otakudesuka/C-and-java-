package tpack;
import java.util.*;
public class tvshows1
{
 public void genre()
  {
    Scanner sc=new Scanner(System.in);
    int ch1;
    System.out.println("\n1.Dramas\n2.Documentaries\n3.Talk Shows\n4.Reality Shows");
    ch1=sc.nextInt();
    switch(ch1)
    {
      case 1: dramas();
              break;
      case 2: doc();
              break;
      case 3: talk();
              break;
      case 4: reality();
              break;
    }
  }
  public void pop()
  {
    Scanner sc=new Scanner(System.in);
    int ch2;
    System.out.println("\n1.Hot\n2.Warm\n3.Cold");
    ch2=sc.nextInt();
    switch(ch2)
    {
      case 1: hot();
              break;
      case 2: warm();
              break;
      case 3: cold();
              break;
    }
  }
  public void hot()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] hotE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of Hottest Dramas of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+hotE[i]);
              }
              break;
     case 2:  String[] hotH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hottest Tv Shows of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+hotH[i]);
              }
              break;
    }
  }
  public void warm()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] warmE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of Moderately Popular Tv Shows of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+warmE[i]);
              }
              break;
     case 2:  String[] warmH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Moderately Popular Tv Shows of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+warmH[i]);
              }
              break;
    }
  }
  public void cold()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] coldE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of Least Popular Tv Shows of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+coldE[i]);
              }
              break;
     case 2:  String[] coldH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Least Popular Tv Shows of 2018 are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+warmH[i]);
              }
              break;
    }
  }
 public void dramas()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] dramasE={"Nappily Ever After", "Deadpool", "Deadpool 2", "efrfg"};
              System.out.println("The list of English Dramas are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+dramasE[i]);
              }
              break;
     case 2:  String[] dramasH={"dcfgv", "drtfyg", "tgv", "sedrft"};
              System.out.println("The list of Hindi Dramas are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+dramasH[i]);
              }
              break;
    }
  }
 public void doc()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] docE={"Conjuring", "Insidious", "Anabelle", "Purge"};
              System.out.println("The list of English Documenteries are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+docE[i]);
              }
              break;
     case 2:  String[] docH={"cf", "poijuh", "xdcf", "drfcvg"};
              System.out.println("The list of Hindi Documenteries are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+docH[i]);
              }
              break;
    }
  }
public void talk()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] talkE={"Pretty Women", "Twilight", "Book Club", "Tangled"};
              System.out.println("The list of English Talk Shows are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+talkE[i]);
              }
              break;
     case 2:  String[] talkH={"sed", "drtfg", "xdcf", "tfgh"};
              System.out.println("The list of Hindi Talk Shows are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+talkH[i]);
              }
              break;
    }
  }
  public void reality()
  {
    int c,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Choose Language-\n1.English\n2.Hindi\n");
    c=sc.nextInt();
    switch(c)
    {
      case 1: String[] realityE={"fcg", "ftygh", "dfcgv", "sedtrf"};
              System.out.println("The list of English Reality Tv Shows are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+ realityE[i]);
              }
              break;
     case 2:  String[] realityH={"drttf", "derf", "tyu", "yuhj"};
              System.out.println("The list of Hindi Reality Tv Shows are");
              for(i=0;i<4;i++)
              {
               System.out.println((i+1)+". "+ realityH[i]);
              }
              break;
    }
  }
public void tvshows()
{
    int ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Search tvshows by-\n1.Genre\n2.Popularity");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1: genre();
              break;
      case 2: pop();
              break;
    }
}
}