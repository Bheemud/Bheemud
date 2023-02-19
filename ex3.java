package examples;

class AC{
	int temp;
	public void  intiTemparature() {
		temp=22;
	}
	public void showTemparature() {
		System.out.println("Temparature :"+temp);
	}
	public void changeTemparature(int temparature) {
		temp=temparature;
	}
}
public class ex3 {
	public static void main(String[] args) {
		AC ac1=new AC();
		ac1.intiTemparature();
		ac1.showTemparature();
		AC ac2=new AC();
		ac2.intiTemparature();
		ac2.showTemparature();
		AC ac3=new AC();
		ac3.intiTemparature();
		ac3.showTemparature();
		System.out.println("************");
		ac3.changeTemparature(18);
		ac1.showTemparature();
		ac2.showTemparature();
		ac3.showTemparature();
	}
}
