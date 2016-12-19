public class KokBulma {
	public static void main(String[] args) {
		
	double a=3;
	double b=2;
	double c=-4;
	double d, x1,x2;
	
	d=b*b-4*a*c;
	x1=(-b-Math.sqrt(d))/(2*a);
	x2=(-b+Math.sqrt(d))/(2*a);
	
	System.out.print("Kök 1 ="); System.out.println(x1);
	System.out.print("Kök 2 ="); System.out.println(x2);
	}
}
