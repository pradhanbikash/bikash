import java.util.Scanner;
public class NumReverse {

	public static void main(String[] args) {
	int no=0, rev=0;
	System.out.println("Enter the value of for reverse:");
	Scanner s =new Scanner(System.in);
	no=s.nextInt();
	while(no!=0)
	{
		rev=rev*10;
		rev=rev+no%10;
		no=no/10;
		System.out.println("Reverse no is:"+rev);
	}
	

	}

}
