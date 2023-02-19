package examples;


class This
{
	int i;
	public void m1(int i)
	{
		this.i=i;
		System.out.println(i);
	}
}
public class thisKeyword {

	public static void main(String[] args) {
		This t1=new This();
		This t2=new This();
		This t3=new This();
		t1.m1(12);
		t2.m1(34);
		t3.m1(67);
	}

}
