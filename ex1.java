package examples;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] arg) {
		for(;;){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int d=0;
		if(n>9||n<1) {
			System.out.println("Invalid Input");
			return;
		}
		int a=((3*n)+3)*3; 
		for(;a>0;a=a/10) 	 
			d=d+(a%10);	
		System.out.println(d);
	}
}
}
