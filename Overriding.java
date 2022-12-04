package upcastingdemo;
class parent 
{
	void phone()
	{
		System.out.println("samsung");
		
	}
}
class Child extends parent 
{
	//child has defined the new implementation
	void phone()
	{
	System.out.println("iphone");
}

public class Overriding {

	public static void main(String[] args) {
		
Child child = new Child();
child.phone();

	}

}
}

