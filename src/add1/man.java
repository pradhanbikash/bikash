package add1;



public class man {

	public static void main(String[] args) {
		
		int c;
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		c=a+b;
		System.out.println("Addition of c:"+c);
		c=a-b;
		System.out.println("Substraction of c:"+c);
		c=a*b;
		System.out.println("multiplication  of c:"+c);
		c=a/b;
		System.out.println("division of c:"+c);
		
	}
}
