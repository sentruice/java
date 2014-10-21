import java.util.Random;
import java.util.Scanner;

public class practice7_10 {
    
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    
    static boolean confirmRetry() {
	int cont;
	do {
	    System.out.print("もう一度？<Yes...1/No...0>:");
	    cont = scan.nextInt();
	}while(cont != 1 && cont != 0);
	return cont == 1;
    }
    
    public static void main(String[] args) {
	Random rand = new Random();
	System.out.println("暗算トレーニング！");

	do {
	    int x = rand.nextInt(900) + 100;
	    int y = rand.nextInt(900) + 100;
	    int z = rand.nextInt(900) + 100;

	    while(true) {
		System.out.print(x + "+" + y + "+" + z + "=");
		int k = scan.nextInt();
		if (k == x + y + z)
		    break;
		    System.out.println("違います。");
	    }
	}while(confirmRetry());
    }
}
