package add3;

public class Math_class {

	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
		double b=3.145;
		System.out.println("Square Root:="+Math.sqrt(a));
		System.out.println("Cube Root:="+Math.cbrt(a));
		System.out.println("Absolute value:="+Math.abs(a));
		System.out.println("Absolute value of(-1):="+Math.abs(-1));
		System.out.println("Floor value of b:="+Math.floor(b));
		System.out.println("Ceil value of b:="+Math.ceil(b));
		System.out.println("Degree of 200 radian:="+Math.toRadians(200));
		System.out.println("Radian of 180 degree:="+Math.toDegrees(180));
		System.out.println("Maximum between 10 and 20:="+Math.max(10, 20));
		System.out.println("Minimum between 10 and 20:="+Math.min(10, 20));
		

	}

}
