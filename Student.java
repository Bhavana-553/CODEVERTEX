import java.util.*;
public class Student {
	private int marks[];
	private int sum;
	private double per;
	private int n;
	public Student(int n)
	{
		this.n=n;
		this.sum=0;
		this.per=0.0;
		this.marks=new int[n];
	}
	public  void Input()
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the marks of the strudent in "+n+" subjects out of 100");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		sc.close();
	}
	public void CalculateTotalMarks()
	{
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
			
	}
	public void CalculateAveragePer()
	{
		per=(double)sum/n;
		
	}
	public void Grade()
	{
		char ch;
		if(per>=90)
		{
			ch='A';
			System.out.println("grade:"+ch);
		}
		else if(per>=80)
		{
			ch='B';
			System.out.println("grade:"+ch);
			
		}
		else if(per>=70)
		{
			ch='C';
			System.out.println("grade:"+ch);
			
		}
		else if(per>=50)
		{
			ch='D';
			System.out.println("grade:"+ch);
			
		}
		else if(per>=40)
		{
			ch='P';
			System.out.println("grade:"+ch);
			
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(5);
		s.Input();
		s.CalculateTotalMarks();
		s.CalculateAveragePer();
		s.Grade();
		
		

	}

}
