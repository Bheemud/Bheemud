package examples;

import java.util.Scanner;



//public class Reve {
//
//	public static void main(String[] args) {
//		System.out.println("Hello Java");
//	}
//
//}
/*****Basic Program************/


//class A9
//{
//	public static void m1()
//	{
//		System.out.println("This is m1 method");
//	}
//}
//class B9
//{
//	public void m2()
//	{
//		System.out.println("This is m2 method");
//	}
//}
//public class Reve {
//	    static public void main(String[] args) {
//		System.out.println("Hello Java");
//		A9.m1();
//		B9 b = new B9();
//		b.m2();
//	}
//
//}
/*******method calling******/


//
//public class Reve {
//	int i=10;
//	static int j=20;
//    static public void main(String[] args) {
//    	int i=30;
//    	System.out.println("Local variable"+i);
//    	System.out.println("Static variable"+Reve.j);
//    	Reve r=new Reve();
//    	System.out.println("Non-static variable"+r.i);
//    }
//
//}
/*******Variables**********/

//
//public class Reve {
//    static public void main(String[] args) {
//    	int a=20;
//    	int b=20;
//    	if(a>b) {
//    		System.out.println("a is big number");
//    	}
//    	else if(b>a) {
//    		System.out.println(" b is big number");
//    	}
//    	else
//    	{
//    		System.out.println("Both are equal");
//    	}
//    }
//}
//Switch stmt
/********Conditional Statements********/
//public class Reve {
//    static public void main(String[] args) {
//    	for(int i=1;i<=10;i++) System.out.println(i);
    	
    	
//    	int n=1;
//    	while(n<=10) {
//    		System.out.println(n);
//    		n++;
//    	}
    	
    	
//    	int n=1;
//    	do {
//    		System.out.println(n);
//    	while(n<=10){
//    		System.out.println(n);
//    		n++;
//    	}
//    	}
//    	while(n==10); {
//    		System.out.println(n);
//    	}
    	
//    	
//    	int []a= {10,20,30,40,50};
//    	System.out.println("For loop");
//    	for(int i=1;i<a.length;i++) {
//    		System.out.println(a[i]);
//    	}
//    	System.out.println("for Each loop");
//    	for(int n:a) {
//    		System.out.println(n);
//    	}
    	/*******Loops**********/
    	


//class method1
//{
//	public static void m1() //No-arg method
//	{
//		System.out.println("method m1");
//	}
//}
//class method2
//{
//	public static void m2(int n) //Parameterized method
//	{
//		method1.m1();
//		System.out.println("method m2");
//	}
//}
//public class Reve {
//	static public void main(String[] args) {
//		method2.m2(2);
//    }
//}
/****Methods********/



//public class Reve {
//	static public void main(String[] args) {
//		main();
//		main(5);
//		main("Bheem");
//	}
//		public static void main() {
//			System.out.println("method 1");
//		}
//		public static void main(int i) {
//			System.out.println("method 2 "+i);
//		}
//		public static void main(String s) {
//			System.out.println("method 3 "+s);
//		}
//}
/******Method Overloading*******
 * 
 * Basics completed*/











                           /**********OOPS ********/

/* Class
 * Object
 * Inheritance
 * Abstraction
 * Encapsulation
 * Polymorphism
 * 
 */
/******Class ****/
//public class Reve
//{
//	static public void main(String[] args) 
//	{
//		
//	}
//} 


/******Object ****/
class object
{
	public static void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
}
public class Reve
{
	static public void main(String[] args) 
	{
		object.m1();
		object a=new object();
		a.m2();
		
	}
} 








