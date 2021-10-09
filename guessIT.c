#include<stdio.h>
#include<string.h>
#include<malloc.h>

struct node
{
    char data;
    struct node*link;
};
struct node*root=NULL;
void create(char num)
{
    struct node*temp,*r;
    if(root==NULL)
    {
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=num;
        temp->link=NULL;
        root=temp;
    }
    else
    {
        temp=root;
        while(temp->link!=NULL)
        {
            temp=temp->link;
        }
        r=(struct node*)malloc(sizeof(struct node));
        r->data=num;
        temp->link=r;
        r->link=NULL;
    }
}
void display()
{
    int i;
    struct node*p;
    p=root;
    while(p!=NULL)
    {
        printf("%c\n",p->data);
        p=p->link;
    }
}
int check()
{
	struct node *t;
    t=root;
    int k=0,a,i;
    char g[20];
	scanf("%s",g);
    for( i=0;g[i]!='\0';i++)
    {
       if(g[i]==t->data)
       {
         t=t->link;
         a=1;
         printf(".");
       }
      else
      {
         printf("\n                                 Ehh! Wrong guess..try again!!!\n");
         a=0;
         break;
      }
    } 
	if(a==1)
	{
		printf("\n     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        printf("\n     $                                                                                     $");
        printf("\n     $                                  player two has won!!!!                             $");
        printf("\n     $                                                                                     $");
        printf("\n     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		return a;
		
	 } 
	 if(a==0)
	 {
	 	return a;
	 }
}
void main()
{
	int i,c=0,b;
    char s[20],g[20],r,h[20];
    printf("\n                     H    H  AAAAAA  N    N  GGGGGG  M    M  AAAAAA  N    N");
    printf("\n                     H    H  A    A  NN   N  G       MM  MM  A    A  NN   N");
    printf("\n                     H    H  A    A  N N  N  G       M MM M  A    A  N N  N");
    printf("\n                     HHHHHH  AAAAAA  N  N N  G  GGG  M MM M  AAAAAA  N  N N");
    printf("\n                     H    H  A    A  N   NN  G    G  M    M  A    A  N   NN");
    printf("\n                     H    H  A    A  N    N  GGGGGG  M    M  A    A  N    N");
    printf("\n");
    printf("\n                                player one are you ready?????");
    printf("\n                                 then enter your word!!!!!\n");
    scanf("\n%s",s);
    for(i=0;s[i]!='\0';i++)
    {
        r=s[i];
        create(r);
        c++;
    }
    for(i=0;i<50;i++)
    {
    	printf(".\n");
	}
	printf("\n");
	printf("                               player 1 plz enter a hint for player 2\n");
	scanf("%s",h);
    printf("\n                                    player two are you ready??????");
    struct node *t;
    t=root;
    int k=0,a;
   while(k<3)
   {
    printf("\n                                   Enter your %d guess player two!!!!!\n",(k+1));
    b=check();
    if(b==1)
    {
    	break;
	}
	if(b==0)
	{
		k++;
	}
  }
  if(k==3)
  {
  	
  		printf("\n     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        printf("\n     $                                                                                     $");
        printf("\n     $                                  player one has won!!!!                             $");
        printf("\n     $                                                                                     $");
        printf("\n     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  }
}
