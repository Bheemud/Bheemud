package examples;

/**** Constructor ****/
//class cons
//{
//	public cons()
//	{
//		System.out.println("Constructor method");
//	}
//}
//public class constructor {
//
//	public static void main(String[] args) {
//		new cons();
//		
//	}
//
//}


/******* Constructor Overloading **********/

//class cons
//{
//	int i;
//	public cons()
//	{
//		System.out.println("Constructor method");
//	}
//	public cons(int i)
//	{
//		this.i=i;
//	}
//	public void display()
//	{
//		System.out.println(i);
//	}
//}
//public class constructor {
//
//	public static void main(String[] args) {
//		cons c=new cons();
//		cons c1=new cons(51);
//		c1.display();
//		
//	}
//
//}



/******* Copy Constructor **********/


//class cons
//{
//	int i,j;
//	public cons(int i,int j)
//	{
//		this.i=i;
//		this.j=j;
//	}
//	public cons(int i,cons c)
//	{
//		this.i=i;
//		this.j=c.j;
//	}
//	public void display()
//	{
//		System.out.println(i+" "+j);
//	}
//}
//public class constructor {
//
//	public static void main(String[] args) {
//		cons c=new cons(51,24);
//		c.display();
//		cons c1=new cons(51,c);
//		c1.display();
//		
//	}
//
//}


/*********** call to this() ******/


//class cons
//{
//	
//	public cons()
//	{
//		System.out.println(" No args constructor ");
//	}
//	public cons(int i)
//	{
//		this();
//		System.out.println(" 1 args constructor ");
//	}
//	public cons(int i,int j)
//	{
//		this(22);
//		System.out.println(" 2 args constructor ");
//	}
//}
//public class constructor {
//
//	public static void main(String[] args) {
//		cons c=new cons(51,24);
//	}
//
//}


/************ Constructor Calling ***********/


class cons
{
	int i,j;
	public cons(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public cons(int k)
	{
		this(k,k);
	}
	public void display()
	{
		int res=i+j;
		System.out.println(i+" + "+j+" = "+res);
	}
}
public class constructor {

	public static void main(String[] args) {
		cons c=new cons(51,24);
		c.display();
		cons c1=new cons(51);
		c1.display();
	}

}