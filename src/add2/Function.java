package add2;

public class Function {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		System.out.println("x="+x);
		int y=100;//y has been initialized with an arbitrary value.
		if(x!=0)
		{
			if(x>0)
				y=1;
			if(x<0)
				y=-1;
			
		}
		else
			y=0;
		System.out.println(y);

	}

}
