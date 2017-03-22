package add1;

public class Biggest {

	public static void main(String[] args) {
		int a=40;
		int b=20;
		int c=30;
		int big=(a>b)?(a>c?a:b):(b>c?b:c);
		System.out.println("Big is"+big);

	}

}
