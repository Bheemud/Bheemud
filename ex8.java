package examples;

//
//class A8
//{
//	int i;
//	public int m1(int i)
//	{
//		this.i=i;
//		return i;
//	}
//	
//}
class A8
{
	public  void  A()
	{
		System.out.println("constructor class A8");
	}
}
class B8
{
	public  void  B()
	{
//		A8 a8 = new A8();
//		a8.A();
		System.out.println("constructor class B8");
	}
}
public class ex8 {

	public static void main(String[] args) {
//		A8 a = new A8();
//		int v=a.m1(4);
//		System.out.println(v);
		B8 b = new B8();
		b.B();
		
	}

}












