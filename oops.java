package examples;

//class AB{
//	int i;
//	static int j;
//}
//
//public class oops {
//	public static void main(String[] args) {
//		AB a1=new AB();
//		AB a2=new AB();
//		AB a3=new AB();
//		System.out.println(a1.i);
//		System.out.println(a2.i);
//		System.out.println(a3.i);
//		System.out.println("****************");
//		System.out.println(a1.j);
//		System.out.println(a2.j);
//		System.out.println(a3.j);
//		System.out.println("****************");
//		a1.j=10;
//		System.out.println(a1.j);
//		System.out.println(a2.j);
//		System.out.println(a3.j);
//		System.out.println("****************");
//		a1.i=20;
//		System.out.println(a1.i);
//		System.out.println(a2.i);
//		System.out.println(a3.i);
//		
//	}
//
//}




class AB{
	int i;
}
public class oops {
	public static void main(String[] args) {
		AB a1=new AB();
		AB a2=a1;
		AB a3=a1;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a2.i);
		System.out.println("****************");
		a3.i=10;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a2.i);
	}
}
