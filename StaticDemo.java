
class Emp
{
	int id;
	int salary;
	static String ceo;
		
	public Emp()
	{
		id = 1;
		salary = 3000;
		System.out.println("in constructor");
	}
	
	static
	{
		ceo = "Mohit";
		System.out.println("in static");
	}
	
	public void show()
	{
		System.out.println(id + ":" + salary + ":" + ceo);	
	}
	
}

public class StaticDemo 
{
	public static void main(String args[])
	{
		Emp navin = new Emp();
		Emp rohit = new Emp();
			
		navin.show();
		rohit. show();
	}

}
