package add1;
class Base
{
	public Base()
	{
		System.out.println("Base class ctor called");
		foo();
	}
	public void foo()
	{
		System.out.println("Base class foo called");
	}
	}
class Derived extends Base
{
	public Derived()
	{
		System.out.println("Derived class ctor called");
		foo();
	}
	public void foo()
	{
		System.out.println("Derived class foo called");
	}
	
	}

public class Temp {

	public static void main(String[] args) {
		new Derived();

	}

}
