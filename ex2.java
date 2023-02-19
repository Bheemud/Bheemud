package examples;
class A{
	int i; 
	int j;
	public void getValue(){
		i=18;
		j=20;
	}
	public void getValue(int i1,int j1) {
		i=i1;
		j=j1;
	}
	public void display() {
		System.out.println(i+" "+j);
	}
}
public class ex2{
	public static void main(String[] arg) {
		A a1 = new A();
		a1.i=10;
		a1.j=20;
		//System.out.println(a1.i);
		//System.out.println(a1.j);
		a1.getValue(12,34);
		a1.display();
		System.out.println(a1.i);
		System.out.println(a1.j);
		A a2=new A();
		a2.getValue(45,21);
		a2.display();
		System.out.println(a2.i);
		System.out.println(a2.j);
	}
}


