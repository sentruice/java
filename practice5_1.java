import java.util.Scanner;

public class practice5_1 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("整数:");
	int i = scan.nextInt();
	System.out.printf("8進数:%o\n",i);
	System.out.printf("16進数:%x\n",i);
    }
}

