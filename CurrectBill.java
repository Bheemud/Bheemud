package examples;
import java.util.Scanner;

public class CurrectBill {
	static int a;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total Units : ");
		int u=sc.nextInt();
		System.out.println("Enter pending bill");
		int p=sc.nextInt();
		if(u<=50){
			System.out.println("zero for this month");
			
		}
		if(u>50 && u<=100){
			a=u-50;
			a=a*2;
			System.out.println("this month your current bill is : "+a);
		}
		if(u>100 && u<=150){
				a=u-50;
				a=a-50;
				a=(a*5)+100;
			System.out.println("this month your current bill is : "+a);
		}
		if(u>150 && u<=200){
				a=u-50;
				a=a-100;
				a=(a*9)+350;
			System.out.println("this month your current bill is : "+a);
		}
		if(u>200){
				a=u-50;
				a=a-150;
				a=(a*15)+800;
				System.out.println("this month your current bill is : "+a);
		}
		if(p<=0){
			int dis=a*6/100;
				a=a-dis;
			System.out.println("discount : "+dis);
			System.out.println("Pay bill is : "+a);
		}
		else{
			int in=p+p*15/100;
				a=a+in;
			System.out.println("Interest for pending bill : "+in);
			System.out.println("Total Pay bill is : "+a);
				
		}

	}

}
