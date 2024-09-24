import java.util.*;
public class Bank {
	double balance;
	public Bank(double b) {
		balance =b;
		
	}
	public void display()
	{
		System.out.println("balance:"+balance);
	}
	public void withdraw(double w)
	{
		balance-=w;
		
		
	}
	public void deposite(double d)
	{
		balance+=d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(50000);
		Scanner sc=new Scanner (System.in);
		System.out.println("1 for display amount");
		System.out.println("2 for withdraw amount");
		System.out.println("3 for deposite amount");
		System.out.println("4 for deposite exit");
		int choice;
		while(true)
		{
			System.out.println("enter your choice");
			choice=sc.nextInt();
			if(choice==1)
			{		b.display();
			}
			else if(choice==2)
			{
				double amt;
				System.out.println("enter the amount to  withwdraw");
				amt=sc.nextDouble();
				b.withdraw(amt);
				
			}
			else if(choice==3)
			{
				double a;
				System.out.println("enter the amount to deposite");
				a=sc.nextDouble();
				b.deposite(a);
			}
			else if(choice==4)
			{
				break;
			}
			
			}

	}

}
