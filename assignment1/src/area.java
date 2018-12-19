import java.util.Scanner;

class circle{
	public static float calarea(float r) {
		float area = (float)Math.PI * r * r;
		return area;
	}
	
}

public class area {
	public static void main(String args[])
	{
		System.out.print("Enter a radius: ");
		Scanner in = new Scanner(System.in);
		float radius = in.nextFloat();
		System.out.println("Area of circle is " + circle.calarea(radius));
		in.close();
	}
}
