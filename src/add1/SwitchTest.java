package add1;

public class SwitchTest {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		switch(number)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Invalid argument");
		}
		

	}

}
