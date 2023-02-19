package examples;

class book
{
	String name;
	String publication;
	int pages;
	double price;
	public book(String name, String publication, int pages, double price) {
		
		this.name = name;
		this.publication = publication;
		this.pages = pages;
		this.price = price;
	}
	
}
class Ebook extends book
{
	String format;
	public Ebook(String name, String publication, int pages, double price, String format)
	{
		super(name,publication,pages,price);
		this.format = format;
	}
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("publication : "+publication);
		System.out.println("name : "+pages);
		System.out.println("name : "+price);
		System.out.println("name : "+format);
	}
}


public class library {

	public static void main(String[] args) 
	{
		Ebook b=new Ebook("jhcsaj","kjhcbas",5665, 4644.54,"bheem");
		b.display();
		
	}

}
