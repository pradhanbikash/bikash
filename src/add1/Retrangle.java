package add1;

public class Retrangle {

	public static void main(String[] args) {
		float length=Float.parseFloat(args[0]);
		float breath=Float.parseFloat(args[1]);
		float area=length*breath;
		float perimeter=2*(length+breath);
		
		 
		        System.out.println("Retrangle Area is : "+area);
		        System.out.println("Retrangle perimeter is : "+perimeter);
		       

	}

}
