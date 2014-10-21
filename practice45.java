import java.util.Scanner;

public class practice45 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x, y, z;
	do {
	    System.out.println("何センチから？");
	    x = scan.nextInt();
	    System.out.println("何センチまで？");
	    y = scan.nextInt();
	    System.out.println("何センチごと？");
	    z = scan.nextInt();
	} while ((x <= 0) && (y <= 0) && (z <= 0));
	
	System.out.println("慎重 標準体重");
	
	for (int i = x; i <= y; i += z) {
	    System.out.println(i + " " + ((i - 100) * 0.9));
	}
    }
}
