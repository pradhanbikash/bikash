package add2;

public class NaturalNum {

	public static void main(String[] args) {
		number(10);
	}
	private static void number(int n)
	{
		if(n<1)
			return;
		else
			number(n-1);
		System.out.println(n);
		return;
	}

	}


