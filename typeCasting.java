package examples;

/*  #### Primitive typecasting ###  */

//public class typeCasting {
//
//	public static void main(String[] args) {

//		widening typeCasting..

//		int a=65;
//		double d=a;
//		float f=a;
//		System.out.println(d);
//		System.out.println(f);
		
//		Narrowing typeCasting..

//		double d=10.0;
//		int a=(int) d;
//		float f=(float) d;
//		System.out.println(a);
//		System.out.println(f);		
//	}
//
//}

/*  #### Non-Primitive typecasting ###  */



		//*****UpCasting and DownCasting*******...

class Upcasting
{
	public void m1()
	{
		System.out.println("m1 upcasting method");
	}
	public void m2()
	{
		System.out.println("m2 upcasting method");
	}
}
class Downcasting extends Upcasting
{
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("m1 upcasting Override method");
	}
	public void m3()
	{
		System.out.println("m3 Downcasting method");
	}
}

public class typeCasting {
	public static void main(String[] args) {	
		
		Upcasting u=new Downcasting();  //Upcasting..
		u.m1();
		u.m2();
		((Downcasting)u).m3();   //Downcasting..
	}
}



/*Upcasting is used for access the parent class properties. 
 *To use upcasting we can access the parent class methods and in sub class overridden methods.
 *
 *Downcasting is used for access the parent class and sub class(Both) properties. 
 *To do downcasting with the help of super class reference.
 *without upcasting we can't do downcasting.
 *  */
 