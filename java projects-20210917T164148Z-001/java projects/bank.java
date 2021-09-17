import java.util.*;

class bank

{
  
  String name,type;
  int no,bal;
  bank(String name, String type)
  
  {
    
    this.name=name;
    
    this.type=type;
  
  }
  
  bank(int no, int bal)
  
  {
    
    this.no=no;
    
    this.bal=bal;
  
  }
  
  void display()
  
  {
    
    System.out.println("Account Holder\tType of Account\tAccount Number\tBalance in Account");
    
    System.out.println(name+"\t"+type+"\t"+no+"\t"+bal);
  
  }
  
  void deposit()
  
  {
    
  
    System.out.println("Enter the amount to be deposited");
    Scanner sc= new Scanner(System.in);
    int dep=sc.nextInt();
    bal=bal+dep;
  }
  

  void withdraw()
  {
    if(bal>=5000)
    {
    System.out.println("Enter the amount to be withdrawn");
    Scanner sc= new Scanner(System.in);
    int with=sc.nextInt();
    bal=bal-with;
    }
  }
  public static void main(String args[])
  {
    System.out.println("Enter- Account holder name, Account type(savings/current), Acoount number, Balance amount in the account");
    Scanner sc= new Scanner(System.in);
    name=sc.nextLine();
    type=sc.nextLine();
    no=sc.nextInt();
    bal=sc.nextInt();
    bank b1=new bank(name,type);
    bank b2=new bank(no,bal);
    do
    {
    System.out.println("Enter choice- \n1. Display details \n2.Deposit Amount \n3.Withdraw Amount \n4.Exit");
    int ch=sc.nextInt();
    switch(ch)
    {
      case 1: b1.display();
              break;
      case 2: b1.deposit();
              break;
      case 3: b1.withdraw();
              break;
    }
    }while(ch!=4);
  }
}
