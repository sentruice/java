import java.util.Scanner;

public class practice5_2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("変数xはfloat型、変数yはdouble型です。");
	System.out.print("変数x:");
	float x = scan.nextFloat();
	System.out.print("変数y:");
	double y = scan.nextDouble();

	System.out.println("x = " + x);
	System.out.println("y = " + y);
    }
}
