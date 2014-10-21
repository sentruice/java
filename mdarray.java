import java.util.Random;
import java.util.Scanner;

public class mdarray {
    public static void main(String[] args) {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	System.out.print("行数:");
	int x = scan.nextInt();
	System.out.print("列数:");
	int y = scan.nextInt();

	int[][] z = new int[x][y];

	for (int i = 0; i < x; i++) {
	    for (int j = 0; j < y; j++) {
		z[i][j] = rand.nextInt(100);
		System.out.println("z[" + i + "][" + j + "] = " + z[i][j]);
	    }
	}

    }
}
