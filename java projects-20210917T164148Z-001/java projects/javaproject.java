import java.util.*;
 class movies1
{
   void genre()
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
   void year()
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
   void one()
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
   void two()
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
   void three()
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
   void four()
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
  void comedy()
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
  void horror()
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
 void romance()
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
   void scifi()
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
 void movies()
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
 class tvshows1
{
  void genre()
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
  void pop()
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
   void hot()
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
   void warm()
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
   void cold()
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
               System.out.println((i+1)+". "+coldH[i]);
              }
              break;
    }
  }
void dramas()
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
 void doc()
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
void talk()
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
 void reality()
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
 void tvshows()
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