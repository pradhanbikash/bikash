package add1;

public class g  {

	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,count=20,i;
		System.out.println(n1+" and "+n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		System.out.println("Hello World!");

}
}
