package examples;


class carDev
{
	String name;
	static int carNo;
	String color;
	
	{
		carNo++;
	}
	public carDev(String name)
	{
		this.name=name;
		color="black";
	}
	public carDev(String name, String color) {
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "carDev [name=" + name + ", color=" + color +",carNo ="+carNo + "]";
	}
	
	
}

public class car {

	public static void main(String[] args) {
		carDev.carNo=550;
		carDev car1=new carDev("BMW");
		System.out.println(car1);
		
		carDev car2=new carDev("KWID","Blue");
		System.out.println(car2);
		
		carDev car3=new carDev("RR","Gray");
		System.out.println(car3);
		
	}

}
