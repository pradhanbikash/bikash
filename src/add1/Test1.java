package add1;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("some() returns:"+some());
	
	static Boolean some()
	{
		while(true)
		{
			try
			{
				return true;
			}
			finally
			{
				break;
			}
			}
		return false;
		}
	}

}
