import java.util.Scanner;

public class practice6_16 {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	int[][] a = new int[3][4];
	System.out.println("行列a");
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a[0].length; j++) {
		System.out.print("a[" + i + "][" + j + "] : ");
		a[i][j] = stdIn.nextInt();
	    }
	}

	int[][] b = new int[4][3];
	System.out.println("行列b");
	for(int i = 0; i < b.length; i++) {
	    for(int j = 0; j < b[0].length; j++) {
		System.out.print("b[" + i + "][" + j + "] : ");
		b[i][j] = stdIn.nextInt();
	    }
	}

	System.out.println("行列a");
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a[0].length; j++)
		System.out.printf("%5d", a[i][j]);
	    System.out.println();
	}
	System.out.println();

	System.out.println("行列b");
	for(int i = 0; i < b.length; i++) {
	    for(int j = 0; j < b[0].length; j++)
		System.out.printf("%5d", b[i][j]);
	    System.out.println();
	}
	System.out.println();

	int[][] c = new int[3][4];
	for(int i = 0; i < c.length; i++)
	    for(int j = 0; j < c[0].length; j++)
		c[i][j] = a[i][j] * b[j][i];

	System.out.println("行列c");
	for(int i = 0; i < c.length; i++) {
	    for(int j = 0; j < c[0].length; j++)
		System.out.printf("%5d", c[i][j]);
	    System.out.println();
	}
	System.out.println();
    }
}
