import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int trials=1;
		int score=0;
		int r=1+(int)Math.random()*(100);
		while(trials<=10)
		{
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		if(r==n) {
			score++;
		System.out.println("your guess is correct!");
		break;
		}
		else if(n>r)
		{
			System.out.println("number is high");
		}
		else if(n<r)
		{
			System.out.println("number is high");
		}
		trials++;
		}
		
		
		System.out.println("your score:"+score);
		System.out.println("number of:"+trials);
		
			
		
		
		
		

	}

}
