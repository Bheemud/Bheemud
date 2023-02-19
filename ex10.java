package examples;

import java.util.Scanner;

public class ex10 {

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int c=0;
//		System.out.println("Enter first number: ");
//		int n1=sc.nextInt();
//		int s=c+n1;
//		char ch;
//		do
//		{
//			System.out.println("Enter secound number: ");
//			int n2=sc.nextInt();
//			s=n2+s;
//			System.out.println("continue press Y ,Not continue press N ");
//			 ch=sc.next().charAt(0);
//		}
//		while(ch=='Y' || ch=='y');
//		System.out.println(s);
		
		
		
		
		
		
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b val : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=a+b;
		for(;;) {
			System.out.println("con 1,stop 2");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("enter num");
			int m=sc.nextInt();
			s=s+m;
		}
		else {
			System.out.println("Total : "+s);
			break;
		}
			
		}
		
	}

}
