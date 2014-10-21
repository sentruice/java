import java.util.Scanner;

public class practice37 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("何個記号を表示しますか？");
	int n = scan.nextInt();
	int i = 0;
	do {
	    if (i % 2 == 1) {
		System.out.println('*');
		i++;
	    }
	    else {
		System.out.println('+');
		i++;
	    }
	} while (i < n);
	if (n > 0) {
	    System.out.println();
	}
    }
}
