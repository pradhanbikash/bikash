import java.lang.String;
public class ReverseString {

	public static void main(String[] args) {
		String word="HelloWorld";
		System.out.println("======================================");	
//reverse String -use StringBuffer		
		//String reverse=new StringBuffer(word).reverse().toString();
		System.out.println("======================================");
//reverse string-use StringBuilder		
	 String reverse=new StringBuilder(word).reverse().toString();
	 System.out.println("======================================");
//without using StringBuffer and StringBuilder
	 //String reverse1= reverse(word);
	 System.out.println("======================================");
System.out.println("Original String:"+word);
System.out.println("Reversed String:"+reverse);

	}

	
}
