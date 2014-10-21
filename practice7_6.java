import java.util.Scanner;

public class practice7_6 {
    
    static void printSeason(int m) {
	if (m >= 3 && m <= 5) {
	    System.out.println("春");
	}
	else if (m >= 6 && m <= 8) {
	    System.out.println("夏");
	}
	else if (m >= 9 && m <= 11) {
	System.out.println("秋");
	}
	else if (m >= 1 && m <= 2 || m == 12) {
	    System.out.println("冬");
	}
	else {
	    System.out.println(" ");
	}
    }
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("何月？:");
	int x = scan.nextInt();
	printSeason(x);
    }

}
