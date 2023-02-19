package examples;

class G
{
	int i;
	public G(int i)
	{
		this.i=i;
	}
	public G(G a)
	{
		this.i=a.i;
	}
	public void display()
	{
		System.out.println("i ="+i);
	}
}
public class Ex7 {

	public static void main(String[] args)
	{
		G g1 = new G(78);
		g1.display();
		G g2 = new G(g1);
		g2.display();
		
	}

}
