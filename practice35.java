import java.util.Scanner;

public class practice35 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("何個*を表示しますか？");
	int x = scan.nextInt();
	int i = 0;
	while (i < x) {
	    System.out.println('*');
	    i++;
	}
	if (0 > x) {
	    System.out.println();
	}
    }
}
