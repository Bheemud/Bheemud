/*    	methods
 -> Based on methods are two types
 1.Parameterized method
 2.No-Argument method
 
 
 *> Parameterized method:
 --> The method having formal arguments is called Pa----.
 -->By providing actual arguments we can call the parameterized method.
 -->No Of formal and actual arguments should be same.
 
 *> No Argument method:
 -->The method not having Arguments that method is called No-argument method.
  
 Eg:
 
 */

package examples;
class A11
{
	public static void m1()
	{
		System.out.println("This is a m1 method for class A");
	}
	public void m2(int n)
	{
		System.out.println("This is a m2 method for class A " +n);
	}
}

public class Methods {
	public static void main(String[] args) {
		A11 a = new A11();
		A11.m1();
		a.m2(51);
		
		
//		A11.m1();
//		A11.m1(5);
//		A11.m1(10,20);
//		
		
//		
//		B11 b = new B11();
//		b.m1();
	}
}




/*  Method Overloading :
  
 --> The methods  having same name and different arguments is called method overloading.
 
 										OR
 										
-->Creating more then one method with same name ,but using different formal arguments in 
   same class is called Method Overloading.
-->It has different arguments,the arguments should be different either type or length.

Eg:->Println();
 
 
 */


//class A11
//{
//	public static void m1()
//	{
//		System.out.println("this method not having arguments");
//	}
//	
//	public static void m1(int a)
//	{
//		System.out.println("This method having only one arguments");
//	}
//	public static void m1(int a,int b)
//	{
//		System.out.println("This method having two arguments");
//	}
//}





/* Method Overriding :
 
 -->--> The methods  having same name and same arguments is called method overloading.
 
 										OR
 										
-->Creating more then one method with same name same formal arguments in 
   same class is called Method Overloading.
--> IS-A relationship is Mandatory. 
-->Uses only for non static methods.



 */


//class A11
//{
//	public void m1()
//	{
//		System.out.println("12345678");
//	}
//}
//class B11 extends A11
//{
//	@Override
//	public void m1()
//	{
//		super.m1();
//		System.out.println("87654321");
//	}
//}
